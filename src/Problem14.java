/**
 * Created by NEXDESK on 01-07-2015.
 */
public class Problem14 {
    public Problem14(long startingNumber) {
        long greatestChainLength = 0;
        long greatestChainLengthStartingNumber = 0;

        for (long i = startingNumber; i > 0 ; i--) {
            if (chainLength(i) > greatestChainLength) {
                greatestChainLength = chainLength(i);
                greatestChainLengthStartingNumber = i;
            }
        }

        System.out.println(greatestChainLength + " is the greatest chain length, which is yield by using the starting number " + greatestChainLengthStartingNumber);
    }

    long chainLength(long number) {
        int chainLength = 0;

        while (number > 1) {
            if (number % 2 == 0) {
                number = number / 2;
                chainLength++;
            }
            else {
                number = number * 3 + 1;
                chainLength++;
            }
        }

        return chainLength;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Problem14(999999);
        System.out.println("Calculated in " + (System.currentTimeMillis()-start) + " ms");

    }
}
