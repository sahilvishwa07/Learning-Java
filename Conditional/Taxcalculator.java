package Conditional;

import java.util.Scanner;

public class Taxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = (int) (0.2 * income);
        }
        else {
            tax = (int) (0.3 * income);
        }
        System.out.println("Your tax is: " + tax);
    }

}