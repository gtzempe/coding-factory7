package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Snowinf iff raining AND temp<0
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert is Raining");
        isRaining = scanner.nextBoolean();
        System.out.println("Please insert is temperature");
        temp = scanner.nextInt();
        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing " + isSnowing);


    }
}
