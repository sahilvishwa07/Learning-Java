package Function;

public class BinarytoDecimal {
        public static void binTodec(int binNum){
            int myNum = binNum;
            int pow = 0;
            int decNUm = 0;
            while (binNum >0 ) {
                int LastDigit = binNum % 10;
                decNUm = decNUm + (LastDigit * (int)Math.pow(2, pow));

                pow++;
                binNum = binNum/10;
            }
            System.out.println("Decimal of " + myNum + " = " + decNUm);

        }
            public static void main(String[] args) {
             binTodec(111);
        }
}
