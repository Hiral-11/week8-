package homework_week8;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// scanner creation to read a data
        System.out.println("Input Fibonacci number count : "); // print statement to enter a number
        int number = scanner.nextInt(); // going to next line
        scanner.close();//closing scanner
        Programme_9_FibonacciNumber obj = new Programme_9_FibonacciNumber(); // calling a method via object
        obj.fibonacci(number);
    }

    public void fibonacci(int number) { // instance method
        int a = 1;
        int b = 1;
        System.out.println("Fibonacci sequence: "); // printing statement for result

        for (int i = 0; i < number; i++) { //for loop
            System.out.println(a + " "); // printing numbers in fibonacci sequence
            //logic to get fibonacci number
            int nextNumber = a + b;
            a = b;
            b = nextNumber;
        }
    }
}
