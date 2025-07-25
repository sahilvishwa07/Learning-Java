package Function;

public class Scope {
    //METHOD SCOPE
    // public static void prints(){
    //     // int s = 25;
    // }
    // public static void main(String[] args) {
    //     // System.out.println(s);
    //     int s = 25;
    //     System.out.println(s);
    // }

    // BLOCK SCOPE
    public static void main(String[] args) {
        int p = 10; //function scope
        {
            int s = 45;
            System.out.println(p);//block scope
        }
        System.out.println(p);
        // System.out.println(s);
    }
}
