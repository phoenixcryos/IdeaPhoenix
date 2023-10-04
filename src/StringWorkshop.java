

import java.util.Scanner;

public class StringWorkshop {

    private static Scanner in = new Scanner(System.in);
    private static String content;

    public static void main(String[] args) {
        System.out.println("Enter a starting of string: ");
        content = in.nextLine();

        int choice;
        do {
            displayMenu();
            choice = in.nextInt();
            in.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addContent();
                    break;
                case 2:
                    checkSubstring();
                    break;
                case 3:
                    outputLength();
                    break;
                case 4:
                    outputAfterPrefix();
                    break;
                case 5:
                    outputBeforeSuffix();
                    break;
                case 6:
                    outputBetweenPrefixAndSuffix();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        in.close();
    }

    private static void displayMenu() {
        System.out.println("\\nPick an option:");
        System.out.println("1. Add content");
        System.out.println("2. Check if string contains substring");
        System.out.println("3. Output length");
        System.out.println("4. Output substring after prefix");
        System.out.println("5. Output substring before suffix");
        System.out.println("6. Output substring between prefix and suffix");
        System.out.println("7. Exit");
    }

    private static void addContent() {
        System.out.print("Enter content to add: ");
        content += in.nextLine();
        System.out.println("Current string: " + content);
    }

    private static void checkSubstring() {
        System.out.print("Enter substring to check: ");
        String substring = in.nextLine();
        if (content.contains(substring)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }

    private static void outputLength() {
        System.out.println("Length is: " + content.length());
    }

    private static void outputAfterPrefix() {
        System.out.print("Prefix: ");
        String prefix = in.nextLine();
        if (content.contains(prefix)) {
            System.out.println("Substring: " + content.substring(content.indexOf(prefix) + prefix.length()));
        } else {
            System.out.println("Prefix not found in the string.");
        }
    }

    private static void outputBeforeSuffix() {
        System.out.print("Suffix: ");
        String suffix = in.nextLine();
        if (content.contains(suffix)) {
            System.out.println("Substring: " + content.substring(0, content.indexOf(suffix)));
        } else {
            System.out.println("Suffix not found in the string.");
        }
    }

    private static void outputBetweenPrefixAndSuffix() {
        System.out.print("Prefix: ");
        String prefix = in.nextLine();
        System.out.print("Suffix: ");
        String suffix = in.nextLine();
        if (content.contains(prefix) && content.contains(suffix) && content.indexOf(prefix) < content.indexOf(suffix)) {
            System.out.println("Substring: " + content.substring(content.indexOf(prefix) + prefix.length(), content.indexOf(suffix)));
        } else {
            System.out.println("Prefix and/or suffix not found in correct order in the string.");
        }
    }
}