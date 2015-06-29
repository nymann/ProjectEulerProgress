/**
 * Created by NEX on 29/06/2015.
 */
public class Problem6 {
    public Problem6() {
        System.out.println(difference(calculateSumOfSquares(), calulateSquareOfTheSum()));
    }

    int calculateSumOfSquares() {
        int sumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += (int) Math.pow(i, 2);
        }

        return sumOfSquares;
    }

    int calulateSquareOfTheSum() {
        int squareOfSum = 0;
        for (int i = 1; i <= 100; i++) {
            squareOfSum += i;
        }
        squareOfSum = (int) Math.pow(squareOfSum, 2);
        return squareOfSum;
    }

    int difference(int i, int j) {
        return j - i;
    }


    public static void main(String[] args) {
        new Problem6();
    }
}
