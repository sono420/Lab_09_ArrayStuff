import java.util.Random;
public class program1 {
    public static void main(String[] args) {
        // a. Declare and initialize the array
        int[] dataPoints = new int[100];

        // b. Initialize  random value between 1 and 100
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // c. Display the dataPoints values separated by " | "
        System.out.print("DataPoints values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // d. Calculate sum and average
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
    }
}
