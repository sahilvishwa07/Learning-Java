package Operators;

public class Logical {
    public static void main(String[] args) {
        //LOGICAL AND &&
        // System.out.println((3>2) && (5>3));

        //LOGICAL OR ||
        // System.out.println((3>2) || (5>3));
        // System.out.println((3<2) || (5<3));
        // System.out.println((3<2) || (5>3));

        // LOGICAL NOT !
        // System.out.println((3>2));

        
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
        System.out.println("Hello");
        }
        if(z > y && z < x){
        System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z){
        System.out.println("Hello Java");
        
        }
    }
}
