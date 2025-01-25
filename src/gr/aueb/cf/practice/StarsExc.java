package gr.aueb.cf.practice;

import java.util.Scanner;

public class StarsExc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please enter the number of stars");
        n = in.nextInt();

        //line
        for (int i = 1;  i <= n; i++) {
            System.out.print("*");
        }
        //column
        for (int i = 1;  i <= n; i++) {
            System.out.println("*");
        }
        //nxn
        for (int i = 1;  i <= n; i++) {
            for (int j = 1; j <= n; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        //1 to n
        for (int i = 1;  i <= n; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        //n to 1
        for (int i = n;  i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

