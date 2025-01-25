package gr.aueb.cf.practice;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please enter the num and the power:");
        num = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result = result * num;
            i++;
        }

        System.out.println("The result is " + result);
    }
}
