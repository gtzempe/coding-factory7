package gr.aueb.cf.practice;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;


        do {
            System.out.println("Choose one from the following:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using our app");
    }
}
