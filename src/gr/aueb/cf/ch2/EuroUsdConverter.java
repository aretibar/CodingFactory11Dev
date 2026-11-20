package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα ακέραιο ποσό σε ευρώ και
 * το πρόγραμμα το μετατρέπει σε δολάρια ΗΠΑ με
 * βάση μία ισοτιμία. Έστω 1 Ευρώ = 99 USA cents.
 *
 * Για παράδειγμα, αν ο χρήστης δώσει 100 ευρώ, τότε
 * τα συνολικά USA cents είναι 9900 και αυτό αντιστοιχεί
 * σε 99 USA Dollars και 0 USA cents.
 */
public class EuroUsdConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PARITY = 99; // USA cents per 1 euro
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.printf("Please enter an amount in euros: ");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d usa cents = %d usa dollars & %d usa cents\n",
                inputEuros, totalUsaCents, usaDollars, usaCents);
    }
}