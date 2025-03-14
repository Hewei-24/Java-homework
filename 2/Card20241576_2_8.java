import java.util.Random;

class Card {
    private String face;
    private String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    protected String getFace() {
        return face;
    }

    protected String getSuit() {
        return suit;
    }

    public String toString() {
        return suit + face;
    }
}

public class Card20241576_2_8 {
    public static void main(String[] args) {
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"黑桃", "红桃", "梅花", "方块"};
        Card[] deck = new Card[52];

        // 初始化牌组
        int index = 0;
        for (String suit : suits) {
            for (String face : faces) {
                deck[index++] = new Card(face, suit);
            }
        }

        // 洗牌
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        // 输出洗牌后的牌组
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }
    }
}