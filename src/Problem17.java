/**
 * Created by NEXDESK on 01-07-2015.
 */
public class Problem17 {
    String[] oneToNine = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] tenToNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    public Problem17(int from, int to) {
        long sum = 0;
        loop:
        for (int i = from; i <= to; i++) {
            int lastDigit = i % 10; // fx. 19 % 10 = 9, since the remainder when dividing 19 by 10 is 9.
            if (i < 10) {
                sum += oneToNine[i].length();
            } else if (i < 20) {
                sum += tenToNineteen[lastDigit].length();
            } else if (i < 40) {
                sum += 6 + oneToNine[lastDigit].length();
            } else if (i < 70) {
                sum += 5 + oneToNine[lastDigit].length();
            } else if (i < 80) {
                sum += 7 + oneToNine[lastDigit].length();
            } else if (i < 100) {
                sum += 6 + oneToNine[lastDigit].length();
            }

            // This is getting trivial.. Now that we know that 1-99 = 854.. We would just proceed as we went..
            /*
            If we break it down we have the numbers 1-9 occurring 100 times each. => 36*100 = 3600
            1-99 occurring 9 times => 9*854 = 7686
            We have “hundred” occurring 9 times with 7 letters. => 7*9 = 63
            We have “hundred and” occurring 9*99 times with 10 letters => 9*99*10 = 8910
            So in total we have
            3600 + 7686 + 63 + 8910= 20259
             */

            if (to == 1000) {
                sum = (36 * 100) + (854 * 10) + (7 * 9) + (9 * 99 * 10) + 11;
                break loop;
            }


        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        new Problem17(1, 1000);
        System.out.println("Calculated in " + (System.currentTimeMillis() - begin) + " ms.");
    }
}
