import java.math.BigInteger;

/**
 * Created by NEX on 02/07/2015.
 */
public class Problem20 {

    public Problem20() {
        String result = factorial(100);
        long sum = 0;

        for (int i = 0; i < result.length(); i++) {
            sum += Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        System.out.println(sum);
    }

    String factorial(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(i + ""));
        }

        return bigInteger.toString();
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        new Problem20();
        System.out.println("Calculated in " + (System.currentTimeMillis()-begin) + " ms.");
    }
}
