package Variable;
import java.util.Scanner;

public class QuesVar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float avg =(a+b+c)/3f;
        // System.out.println(avg);}
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println(area);
        byte b =4;
        char c = 'a';
        short s = 512;
        int i =1000;
        float f = 3.14f;
        double d = 99.9954;
        
        double result = (f*b) + (i %c) - (d*s);
        System.out.println(result);
    }
    }
}
