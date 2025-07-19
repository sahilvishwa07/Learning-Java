package Conditional;

// import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int age = 36;
        if(age>=18){
            System.out.println("you can vote");
        }
        if(age > 13  && age < 18 ){
            System.out.println("teenager");
        }
        else{
            System.out.println("you can't vote");
        }
    }
}
