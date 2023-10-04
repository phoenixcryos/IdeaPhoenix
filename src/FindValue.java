//old project that fits with what we are working on that I would like to get working properly

import java.util.ArrayList;
import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        // Array stuff
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        System.out.println(intArray.length);
        System.out.println(intArray[4]);
       // System.out.println(intArray[5]); // when I uncomment it says the following:
        //5
        //5
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at inclasslab7.main(inclasslab7.java:24)


        // float array with random numbers
        float[] floatArray = new float[10];
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float) Math.random();
        }

        // Get index value of element 5
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int indexValue = array1[4];
        System.out.println(indexValue);

        // ArrayList stuff
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ferrari");
        cars.add("Lamborghini");
        cars.add("Porsche");
        cars.add("Aston Martin");
        cars.add("McLaren");
        System.out.println(cars.get(3));
        System.out.println(cars.size());
        cars.remove(2);
        System.out.println(cars);

        // Loop through ArrayList
        for (String car : cars) {
            System.out.println(car);
        }

        // Close Scanner
        input.close();
    }
}