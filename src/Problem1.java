import java.util.ArrayList;
import java.util.List;

/**
 * Created by NEX on 30/06/2015.
 * Re-did problem 1 to 4 for the sake of completion
 */
public class Problem1 {

    int sumOfMultiplesBelowThisNumber = 1000;

    public Problem1() {
        sumOfAllMultiplesOf3Or5(sumOfMultiplesBelowThisNumber);
    }

    void sumOfAllMultiplesOf3Or5(int belowThis) {
        int i = 1;
        int sum = 0;

        while (i < belowThis) {
            if (i * 3 < belowThis) {
                sum += i * 3;
            }

            if ((i * 5 < belowThis) && (i % 3 != 0)) {
                sum += i * 5;
            }
            i++;
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        new Problem1();
    }
}
