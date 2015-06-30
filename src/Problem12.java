
/**
 * Created by NEX on 30/06/2015.
 */
public class Problem12 {
    public Problem12() {
        triangularNumbers();
    }

    void triangularNumbers() {
        long number = 0;
        long i = 1;

        while (hasMoreThan500Divisors(number) < 500) {
            number += i;
            i++;
        }
        System.out.println(number);
    }

    int hasMoreThan500Divisors(long number) {
        int counter = 0;
        long sqrt = (long) Math.sqrt(number);
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                counter+= 2;
            }

            if (sqrt * sqrt == number) {
                counter--;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        new Problem12();
    }
}
