package homework_week8;

import java.util.Scanner;

/**
 * 10.Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme_10_ArmstrongNumber {
    // Main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        isArmstrongNumber(num);
        scanner.close(); // closing the scanner
    }

    public static void isArmstrongNumber(int number) {

        int originalNumber, remainder, result = 0;

        originalNumber = number; // taking copy of original number for comparision

        while (originalNumber != 0) {

            remainder = originalNumber % 10; // last digit as modulus
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number . ");
    }
}
