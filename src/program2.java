import java.util.Random;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declare and initialize the array dataPoints
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Program-2 Linear scan (search)
        // a.int value between 1 and 100 from the user
        int userValue1 = getRangedInt(scanner, "Enter an integer between 1 and 100", 1, 100);

        // b.
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue1) {
                count++;
            }
        }
        System.out.println("The value " + userValue1 + " was found " + count + " times in the array.");

        // c.
        int userValue2 = getRangedInt(scanner, "Enter another integer between 1 and 100", 1, 100);

        // d.
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                System.out.println("The value " + userValue2 + " was found at array index " + i);
                found = true;
                break; // short the loop
            }
        }
        if (!found) {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }
    }

    // Method to get ranged integer input
    public static int getRangedInt(Scanner scanner, String prompt, int low, int high) {
        int userInput;
        do {
            System.out.print(prompt + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.print(prompt + ": ");
                scanner.next(); // clear input buffer
            }
            userInput = scanner.nextInt();
            scanner.nextLine(); // clear the newline character
        } while (userInput < low || userInput > high);
        return userInput;
    }
}
