package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // int counter = 0;
        // while (counter < 100) {
        //     System.out.print("Hello sahil ");
        //     counter++;
        // }
        // System.out.println(" ");
        // System.out.println("Hello Sahil Printed");


        //print number 1 to 10
        // int n = 0;
        // while (n<=10) {
        //     System.out.println("number : " + n);
        //     n++;
            
        // }
        // System.out.println("number print");


        // print number from 1 to n
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number: ");
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter<=n){
        //     System.out.println("number : " + counter);
        //     counter++;
        // }


        //sum of first n natural no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");

        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println("sum of number is " + sum);

    }
}
