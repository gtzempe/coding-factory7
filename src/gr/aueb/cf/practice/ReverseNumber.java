package gr.aueb.cf.practice;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;
        int rightDigit = 0;
        int reverse = 0;

        System.out.println("Please enter a number");
        num = scanner.nextInt();

        tempNum = num;
        while (tempNum > 0) {

            rightDigit = tempNum % 10;
            reverse = reverse * 10 + rightDigit;
            tempNum = tempNum / 10;

            System.out.println("The number is " + reverse);
        }

    }
}
