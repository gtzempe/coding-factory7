package gr.aueb.cf.practice;

import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = 13;
        int inputNum = 0;
        boolean bingo = false;

        do {


            System.out.println("Please guess the number");
            inputNum = scanner.nextInt();

            if (inputNum == key) {
                bingo = true;
                System.out.println("Bingo bro");
            } else {
                System.out.println("Try again stupid");
            }
        }while (!bingo);
    }
}
