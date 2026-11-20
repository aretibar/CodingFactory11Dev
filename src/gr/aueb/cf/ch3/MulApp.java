package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο έστω n και το πρόγραμμα
 * υπολογίζει το γινόμενο 1 * 2 * 3 ... * n
 */
public class MulApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 1;
        int i = 1;

        System.out.printf("Please enter an integer: ");
        num = scanner.nextInt();

        while (i <= num) {
            result *= i;
            i++;
        }

        System.out.printf("The product is: %d\n", result);
    }
}