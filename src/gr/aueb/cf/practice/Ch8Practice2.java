package gr.aueb.cf.practice;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Ch8Practice2 {
    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            deposit(100);
        } catch (Exception e) {
            System.out.println("An error happened");
        }

    }


    public static void deposit(double amount) throws Exception {

        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive");
            }

            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
            throw e;
        }
    }


    public static void withdraw(double amount) throws Exception {

        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive");
            }

            if (amount > balance) {
                throw new Exception("Amount must be less than balance");
            }
            balance -= amount;
            System.out.println("Successfully withdraw " + amount);
        }   catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }
}
