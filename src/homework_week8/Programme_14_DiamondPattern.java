package homework_week8;

import java.util.Scanner;

/**
 * Write a program in java to display the pattern like a diamond
 * while loop
 */

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the diamond: ");
        int n = scanner.nextInt();
        printDiamond(n);
        scanner.close();
    }

    public static void printDiamond(int n) {
        // upper half of diamond
        int i = 1;
        while (i <= n) {
            //print spaces
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            //print asterisks
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
                }
                System.out.println();
                i++;
            }
            // lower half of the diamond
            i = n - 1;
            while (i >= 1) {
                // print spaces
               int j = 1;
                while (j <= n - i) {
                    System.out.print(" ");
                    j++;
                }

                // print asterisks
                j = 1;
                while (j <= 2 * i - 1) {
                    System.out.print("*");
                    j++;
                }
                    System.out.println();
                    i--;

                }
            }
        }



