
import java.util.*;
import java.math.*;

    public class BigNumber {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            BigInteger bigInt1 = sc.nextBigInteger();
            BigInteger bigInt2 = sc.nextBigInteger();
            sc.close();

            BigInteger sumOfBigInts = bigInt1.add(bigInt2);
            BigInteger productOfBigInts = bigInt1.multiply(bigInt2);

            // System.out.println(sumOfBigInts);
            // System.out.println(productOfBigInts);

            System.out.println(bigInt1 + " + " + bigInt2
                    + " = " + sumOfBigInts);

            System.out.println(bigInt1 + " x " + bigInt2
                    + " = " + productOfBigInts);

        }
    }

