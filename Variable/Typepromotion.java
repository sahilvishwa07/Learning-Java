package Variable;
/*
 * Typepromotion in expression
 * java automatically promotes each byte, short, or char operand to int when evaluating an expression.
 * If one of the operands is long, float, or double, the other operand is promoted to that type.
 * 
 * Example:
 * byte b = 10;
 */
public class Typepromotion {
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // int c = b+a;
        // byte bt = (byte) (a+b+c);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(b-a);
        // System.out.println(a+b);
        // System.out.println(c);
        // System.out.println(bt);
        // int a = 10;
        // float b = 20.645f;
        // long c = 25;
        // double d = 40;
        // double ans = a +b +c +d;
        // System.out.println(ans);
        byte b = 5;
        byte a = (byte)(b * 2);
        System.out.println(a);
    }
}
