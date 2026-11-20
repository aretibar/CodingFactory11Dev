package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20;

        myInt = (int)myLong;    // Error-prone
        myLong = myInt;         // Αυτόματα typecast

    }
}
