package Conditional;

// import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is positive or negative.*/
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter a number :");
        //     int n = sc.nextInt();
        //     if(n>=0){
        //         System.out.println("Positive");
        //     }
        //     else{
        //         System.out.println("Negative");
        //     }
        // }
        
        /*Finish the following code so that it prints You have a fever if your temperature
        is above 100 and otherwise prints You don't have a fever*/
        double temp = 103.5;
        if(temp>=100){
            System.out.println("you have fever");
        }else{
            System.out.println("you dont have fever");
        }
    }
}
