package gr.aueb.cf.ch1;

/**
 * Calclulates the sum of two integers
 * and the result is printed at cosnole
 * (Standard output).
 */

public class AddApp {

    public static void main(String[] args) {
        //Δηλωση και Αρχικοιποιηση μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτυπωση του αποτελεσματος
        System.out.println("Το αποτελεσμα ειναι: " +  result);
        System.out.println("Το αθροισμα των " + num1 + " , " + num2 + " ειναι ισο με: " + result);
        System.out.printf("Το αθροισμα των %d, %d ειναι ισο με: %d\n" , num1, num2, result);
    }
}
