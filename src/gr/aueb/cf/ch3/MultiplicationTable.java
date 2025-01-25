package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δινει ως output τον πολλαπλασιασμο ενος ακεραιου
 * που δινει ο χρηστης με ολους τους ακεραιους απο 1-10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int result = 0;

        System.out.println("Enter an integer: ");

        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            System.out.println();
            i++;
        }
    }
}
