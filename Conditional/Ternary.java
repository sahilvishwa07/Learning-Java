package Conditional;

public class Ternary {
    public static void main(String[] args) {
        
        int number = 9;
        //ternary 
        String type = ((number%2)==0) ? "even": "odd";
        System.out.println(type); 
    }
}
