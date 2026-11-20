package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που αντιστοιχεί
 * σε ώρες (hours). Το πρόγραμμα μετατρέπει σε λεπτά
 * (minutes) και δευτερόλεπτα (seconds) και τα εκτυπώνει.
 */
public class HoursToMinSec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = 60 * 60;
        int inputHours = 0;
        int convMinutes = 0;
        int convSeconds = 0;

        System.out.printf("Please enter the number of hours: ");
        inputHours = scanner.nextInt();

        convMinutes = inputHours * MINUTES_PER_HOUR;
        convSeconds = inputHours * SECONDS_PER_HOUR;

        System.out.printf("%d hours = %d minutes = %d seconds\n", inputHours, convMinutes, convSeconds);
    }
}