import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("座位选择");
        frame.setLayout(new GridLayout(2, 5, 5, 5));

        for (int i = 0; i < 10; i++) {
            JButton seat = new JButton("座位" + i);
            final int seatNum = i;
            seat.addActionListener(e ->
                    System.out.println("座位" + seatNum + "被选中"));
            frame.add(seat);
        }

        frame.setSize(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}