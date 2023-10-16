import java.util.Scanner;

public class arrayReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner initialization
        int[] numbers = new int[100];
        int count = 0;

        System.out.println("Enter values (-1 to stop):");


        while (true) {
            int value = scanner.nextInt();

            if (value == -1 || count == 100) { //check for stop condition
                break;
            }
            numbers[count] = value;
            count++;
        }
        //output of input numbers in reverse order
        System.out.println("Your values, reversed:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        //closing the scanner
        scanner.close();
    }
}
