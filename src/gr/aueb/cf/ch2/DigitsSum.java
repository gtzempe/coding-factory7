package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβανει απο τον χρηστη εναν διωηφιο ακεραιο και να υπολογιζει και να εκτυπωνει το αθροισμα των ψηφιων του.
 * πχ 15 = 1 + 5 = 6
 *
 */
public class DigitsSum {

    public static void main(String[] args) {

        int inputDoubleDigit = 0;
        int inputLeft = 0;
        int inputRight = 0;
        int sum = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("Δώστε εναν διψηφιο αριθομο");

        inputDoubleDigit = in.nextInt();

        inputLeft = inputDoubleDigit / 10;
        inputRight = inputDoubleDigit % 10;
        sum = inputLeft + inputRight;

        System.out.printf("Το άθροισμα είναι: %d" , sum);
    }
}
