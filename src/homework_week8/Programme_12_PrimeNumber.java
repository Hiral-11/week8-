package homework_week8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */

public class Programme_12_PrimeNumber {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner declaration
        System.out.println("Enter any number"); // print the statement for user to enter number
        int a = scanner.nextInt(); //storing value into interger
        scanner.close();//closing scanner

        if (isPrimeNumber(a)) { // nested if else condition calling Primenumber method into main method
            System.out.println(a + " is a Prime number");
        } else if (a <= 1) {
            System.out.println("Invalid input, please enter a positive number greater than 1 only");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }

    public static boolean isPrimeNumber(int num) { // creating static method
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // for loop and to find out prime number or not
            if (num % i == 0) {
                return false;
            }
        }
        return true; //return statement
    }
}
