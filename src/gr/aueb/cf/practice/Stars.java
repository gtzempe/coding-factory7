package gr.aueb.cf.practice;

public class Stars {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            System.out.print("*");
//        }

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("*");
//        }

//          for (int i = 1; i <= 10; i++) {
//              for (int j = 1; j <= 10; j++) {
//                  System.out.print("*");
//              }
//              System.out.println();
//          }

//            for (int i = 1; i <= 10; i++) {
//                for (int j = i; j <= 10; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }



        int result = 1;
        for (int i = 9; i > 7; i--) {
            result = result * i;
        }
        System.out.println(result);
} }

