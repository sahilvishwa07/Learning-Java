package Conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int number = sc.nextInt();
        if (number % 2== 0) {
            System.out.println("Number is Even"+ number);
        }
        else{
            System.out.println("Number is Odd"+ number);
        }
        }

    }
}
