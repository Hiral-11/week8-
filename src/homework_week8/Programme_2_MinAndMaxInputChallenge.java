package homework_week8;

import java.util.Scanner;

/**-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 *-Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Programme_2_MinAndMaxInputChallenge {
    public void m1(Scanner scanner){
        int min = Integer.MAX_VALUE; // using this method to find min value
        int max = Integer.MIN_VALUE; // using this method to find max value

        while (true) {
            System.out.println("Enter Number: "); // print statement

            if (scanner.hasNextInt()) { // if condition
                int number = scanner.nextInt(); // if body
                min = Math.min(min, number); // method use to get minimum value
                max = Math.max(max, number); // method use to get maximum value
        } else {
                break; // break keyword use if any wrong input is entered
            }
            }
        System.out.println("Minimum Number entered: " + min); // printing a statement after breaking point
        System.out.println("Maximum Number entered: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner creation
        Programme_2_MinAndMaxInputChallenge obj = new Programme_2_MinAndMaxInputChallenge();
        obj.m1(scanner); // calling instance method t main method via object
        scanner.close();

    }
}

