/**
 * Created by NEX on 30/06/2015.
 * Re-did problem 1 to 4 for the sake of completion
 *
 * Observation i did during testing, was that when sumOfMultiplesBelowThisNumber, where equal to:
 * 100, result = 2318
 * 1000, result = 233168
 * 10000, result = 23331668
 * 100000, result = 2333316668
 * 1000000, result = 233333166668
 * 10000000, result = 23333331666668
 * 100000000, result = 2333333316666668
 *
 * and so on.. a rather interesting pattern, not sure yet why this is.
 */
public class Problem1 {

    long sumOfMultiplesBelowThisNumber = 100000000;

    public Problem1() {
        System.out.println(sumOfAllMultiplesOf3Or5(sumOfMultiplesBelowThisNumber));
    }

    long sumOfAllMultiplesOf3Or5(long belowThis) {
        long i = 1;
        long sum = 0;

        while (i < belowThis) {
            if (i * 3 < belowThis) {
                sum += i * 3;
            }

            if ((i * 5 < belowThis) && (i % 3 != 0)) {
                sum += i * 5;
            }
            i++;
        }

        return sum;
    }


    public static void main(String[] args) {
        new Problem1();
    }
}
