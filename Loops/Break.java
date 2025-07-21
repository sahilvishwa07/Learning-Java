package Loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out ");

        //keep entering number till user enters a mutiple of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter you Number : ");
            int n = sc.nextInt();

            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("number is multiple is 10 " );

    }
}
