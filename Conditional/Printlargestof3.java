package Conditional;

public class Printlargestof3 {
    public static void main(String[] args) {
        int a = 8 , b = 10 , c = 10;
        if((a>=b) && (a>=c)){
            System.out.println("A is largest");
        }
        else if (b>=c){
            System.out.println(" B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
}
