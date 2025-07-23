package Function;

import java.util.Scanner;

public class Parameters {
    public static void calculateSum(int num1, int num2) { //parameters or formal parameters
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b); // Function call and arguments or actual parameters
    }
}
