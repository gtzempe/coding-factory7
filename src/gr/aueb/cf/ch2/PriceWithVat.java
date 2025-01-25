package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat
 */
public class PriceWithVat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double PRICE_WITH_VAT = 0.24;
        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double vat = 0.0;

        System.out.println("please give the amount:");
        inputPrice = in.nextDouble();
        vat = inputPrice * PRICE_WITH_VAT;
        priceWithVat = inputPrice + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inputPrice, vat, priceWithVat);


    }
}
