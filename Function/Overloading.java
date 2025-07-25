package Function;

public class Overloading {

    //function Overloading with no of parameters

    // public static int sum(int a, int b){
    //     return a+b;
    // }

    // public static int sum (int a, int b, int c){
    //     return a+b+c;
    // }

    // funtion overloading using data types
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3 ));
        System.out.println(sum(5.6f,3.9f));
    }
}