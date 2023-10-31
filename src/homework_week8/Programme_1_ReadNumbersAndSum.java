package homework_week8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers'
 */

public class Programme_1_ReadNumbersAndSum {
    //main method where input has taken form user using scanner class object
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1; // counter
        int sum = 0; // sum variable as zero

        while (i<=10){
            System.out.println("Enter number " +i + ": ");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum += number;
                i++;
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers are: " + sum);
        scanner.close();
    }
}
