import java.math.BigInteger;

/**
 * Created by NEXDESK on 01-07-2015.
 */
public class Problem16 {
    public Problem16(int base, int power) {
        BigInteger bigInteger1, bigInteger2;

        bigInteger1 = new BigInteger(String.valueOf(base));
        bigInteger2 = bigInteger1.pow(power);
        String lol = String.valueOf(bigInteger2);
        sumOfResult(lol);
    }

    void sumOfResult(String number) {
        long sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Problem16(2, 1000);
        System.out.println("Solved in " + (System.currentTimeMillis()-start) + " ms.");
    }
}
