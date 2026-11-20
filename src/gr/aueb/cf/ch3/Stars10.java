package gr.aueb.cf.ch3;

/**
 * shows 10 horizontal stars
 * 1 star - 10 times(maybe there would have been more stars like 50 or 500)
 */

public class Stars10 {
    public static void main(String[] args) {

        int i = 1;          // start index
        int j = 10;

        while (i<= 10) {    //end index 10
            System.out.print("*"); // println τα αστερακια θα ειναι καθετα
            i++;            // step i = i + 1

        }

        System.out.println();

        while (j>=1){
            System.out.print("*");
            j--;
        }
    }
}
