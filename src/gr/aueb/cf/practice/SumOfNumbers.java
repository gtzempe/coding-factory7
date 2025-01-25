package gr.aueb.cf.practice;

public class SumOfNumbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while(i <= 100) {
            sum += i;
            System.out.println("The final number is " + sum);
            i++;

        }
    }
}
