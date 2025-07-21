package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        // for(int i =1;i<=5;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number : ");
            int n = sc.nextInt();

            if(n % 10 ==0){
                continue;
            }
            System.out.println("Number was : " + n);
        }while(true);
        
    }
}
