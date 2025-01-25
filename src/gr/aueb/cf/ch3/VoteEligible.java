package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαιωμα ωηφου σε ηλικιες > 18.
 * Ελεγχει αν μια ηλικια έχει διακιωμα
 * να ψηφισει
 */
public class VoteEligible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int YOU_CAN_VOTE = 18;
        int age = 0;
        boolean isEligible = false;

        System.out.println("Please give age: ");
        age = scanner.nextInt();

        isEligible = age >= YOU_CAN_VOTE;

        System.out.println("You are eligible: " + isEligible);
    }
}
