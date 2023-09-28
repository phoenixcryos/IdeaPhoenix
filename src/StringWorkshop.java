

import java.util.Scanner;
public class StringWorkshop {
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.println("Please enter a valid string.");
       int validString;

       validString = scan.nextInt();

       System.out.println();

       
       System.out.println("Pick an option: ");

       System.out.println("1. Add content");
       System.out.println("2. Check if string contains substring");
       System.out.println("3. Output length");
       System.out.println("4. Output substring after prefix");
       System.out.println("5. Output substring before suffix");
       System.out.println("6. Output substring between prefix and suffix");
       System.out.println("7. Exit");



   }
}
/*
double price = 0.0;
        int drinkSelection;
        int condimentSelection;
        String drinkName = "";
        final double CONDIMENT_COST = 0.25;

        System.out.println("Enter the number of espresso coffee you want to order:");
        System.out.println("Americano - 1, Cappuccino - 2, Mocha - 3?");
        drinkSelection = input.nextInt();

        if (drinkSelection == 1) {
            drinkName = "Americano";
            price = 4.0;
        } else if (drinkSelection == 2) {
            drinkName = "Cappuccino";
            price = 5.0;
        } else if (drinkSelection == 3) {
            drinkName = "Mocha";
            price = 6.0;
        } else {
            System.out.println("Incorrect entry. Espresso drink value set to zero.");
            price = 0.0;
        }

        if (price > 0) {
            System.out.println("Your espresso selection is the: " + drinkName + " - yum!");
            System.out.println("Enter 4 for Cream, 5 for Sugar, 6 for both Cream and Sugar, or 0 for no condiment?");
            condimentSelection = input.nextInt();

            if (condimentSelection == 4 || condimentSelection == 5) {
                price += CONDIMENT_COST;
            } else if (condimentSelection == 6) {
                price += 2 * CONDIMENT_COST;
            }
        }
 */