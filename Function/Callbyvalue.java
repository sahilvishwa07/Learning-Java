package Function;

public class Callbyvalue {
    // public static void main(String[] args) {
    //     //swap = values exchange
    //     int a = 5;
    //     int b = 3;

    //     //swap
    //     int temp = a;
    //     a=b;
    //     b = temp;
    //     System.out.println(a);
    //     System.out.println(b);
    // }

    //swap by function

    public static void swap(int a, int b){
        //swap
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+ a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println("a = "+ a);
        System.out.println("b = " + b);
    }
}
