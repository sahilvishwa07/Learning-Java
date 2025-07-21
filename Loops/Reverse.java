package Loops;

public class Reverse {
    public static void main(String[] args) {
    // int n = 7113;
    // while ( n>0 ) {
    //     int last_digit = n%10;
    //     System.out.print(last_digit);
    //     n = n/10;
    //     }
    //     System.out.println();
    //reverse the given number
    int n=10233;
    int rev = 0;

    while( n > 0){
        int ld = n % 10;
        rev = ( rev*10) + ld;
        n = n/10;
    }
    System.out.println(rev);
    }
}
