public class Java20241576_1_7{

    public static void main(String[] args) {
        int[] numbers = new int[10]; 
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100); 
            System.out.print(numbers[i] + " "); 
        }
        System.out.println(); 

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max=" + max);
        System.out.println("Min=" + min);
    }
}