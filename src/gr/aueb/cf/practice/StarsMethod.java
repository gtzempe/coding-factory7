package gr.aueb.cf.practice;

import java.util.Scanner;

public class StarsMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int numberOfStars = 0;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("Choose Another Option");
                continue;
            }


            if (choice != 6) {
                System.out.println("Please give a number of stars");
                numberOfStars = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    printStarsH(numberOfStars);
                    break;
                case 2:
                    printStarsV(numberOfStars);
                    break;
                case 3:
                    printStarsN(numberOfStars);
                    break;
                case 4:
                    printStars1N(numberOfStars);
                    break;
                case 5:
                    printStarsN1(numberOfStars);
                    break;
                case 6:
                    System.out.println("Thanks for using our app");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;

            }

        } while (choice != 6);
    }


    public static void printMenu() {
        System.out.println("1. n Stars Horizontally");
        System.out.println("2. n Stars Vertically");
        System.out.println("3. n Stars n Stars");
        System.out.println("4. n Stars Asc");
        System.out.println("5. n Stars Desc");
        System.out.println("6. Exit");

    }


    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void printStarsN(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
        }
    }


    public static void printStars1N(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
        }

    }

    public static void printStarsN1(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
        }

    }
}