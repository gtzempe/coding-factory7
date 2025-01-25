package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn Lights on,  if it is raining
 * AND car is running > 100
 * OR is dark
 */
public class LightsOn {
    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean areLightsOn = false;
        int carSpeed = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining: ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark: ");
        isDark = in.nextBoolean();

        System.out.println("Please insert if car is running > 100: ");
        isCarRunning = in.nextBoolean();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isDark || isCarRunning);

        System.out.println("Turn lights on: " + areLightsOn);



    }
}
