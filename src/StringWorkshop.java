import java.util.Scanner;

public class StringWorkshop {
    // using scanner to get user input
    private static Scanner in = new Scanner(System.in);
    private static String content;

    public static void main(String[] args) {
        // ask for the initial string
        System.out.print("Enter a starting of string: ");
        content = in.nextLine();

        // keep showing menu until user wants to exit
        while (true) {
            displayMenu();
            int choice = in.nextInt();
            in.nextLine();  // needed to consume the newline after int input

            if (choice == 7) {  // choice 7 = exit
                System.out.println("Exiting...");
                break;
            }
            
            // process the user's menu choice
            processChoice(choice);
        }

        in.close();  // closing the scanner
    }

    // show the menu to user
    private static void displayMenu() {
        System.out.println("\nPick an option:");
        System.out.println("1. Add content");
        System.out.println("2. Check if string contains substring");
        System.out.println("3. Output length");
        System.out.println("4. Output substring after prefix");
        System.out.println("5. Output substring before suffix");
        System.out.println("6. Output substring between prefix and suffix");
        System.out.println("7. Exit");
    }

    // handle menu choice
    private static void processChoice(int choice) {
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
                outputBetweenPrefixSuffix();
                break;
            default:
                System.out.println("Invalid choice!");  // just in case
        }
    }

    // add more stuff to our string
    private static void addContent() {
        System.out.print("Enter content to add: ");
        content += in.nextLine();
        System.out.println("Current string: " + content);
    }

    // check if our string has some substring
    private static void checkSubstring() {
        System.out.print("Enter substring to check: ");
        String substring = in.nextLine();
        if (content.contains(substring)) {
            System.out.println("It's in there!");
        } else {
            System.out.println("Nope, not in there.");
        }
    }

    // just get and show the length
    private static void outputLength() {
        System.out.println("Length is: " + content.length());
    }

    // get the part after some prefix
    private static void outputAfterPrefix() {
        System.out.print("Prefix: ");
        String prefix = in.nextLine();
        if (content.contains(prefix)) {
            System.out.println("Substring: " + content.substring(content.indexOf(prefix) + prefix.length()));
        } else {
            System.out.println("Can't find that prefix.");
        }
    }

    // get the part before some suffix
    private static void outputBeforeSuffix() {
        System.out.print("Suffix: ");
        String suffix = in.nextLine();
        if (content.contains(suffix)) {
            System.out.println("Substring: " + content.substring(0, content.indexOf(suffix)));
        } else {
            System.out.println("Can't find that suffix.");
        }
    }

    // get the middle part between prefix and suffix
    private static void outputBetweenPrefixSuffix() {
        System.out.print("Prefix: ");
        String prefix = in.nextLine();
        System.out.print("Suffix: ");
        String suffix = in.nextLine();

        if (content.contains(prefix) && content.contains(suffix) && content.indexOf(prefix) < content.indexOf(suffix)) {
            System.out.println("Substring: " + content.substring(content.indexOf(prefix) + prefix.length(), content.indexOf(suffix)));
        } else {
            System.out.println("Prefix/suffix issue. Check their order.");
        }
    }
}
