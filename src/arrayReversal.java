import java.util.Scanner;

public class arrayReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int count = 0;

        System.out.println("Enter values (-1 to stop):");
        int value = scanner.nextInt();

        while (value != -1) {
            numbers[count] = value;
            count++;
            value = scanner.nextInt();
        }

        System.out.println("Your values, reversed:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
