package homework_week8;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {

    public static void symbolTriangle(int n) { // Nested for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");//printing the same line
            }
            System.out.println(); // move to next line
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner declaration
        System.out.println("Input number of rows : ");
       int rows = scanner.nextInt();
        scanner.close(); // closing scanner
        symbolTriangle(rows);
    }
}
