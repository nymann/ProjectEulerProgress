/**
 * Created by NEX on 30/06/2015.
 * This took arround 9 to 10 minutes to run.. the result for 2 million was 142913828922.
 */
public class Problem10 {

    long kappa = 2000000;

    public Problem10() {
        System.out.println("Sum of all primes below " + kappa + " is = " + sumOfPrimes(kappa));
    }

    long sumOfPrimes(long sumOfPrimesBelowThisNumber) {
       long sum = 0;

        for (int i = 1; i < sumOfPrimesBelowThisNumber; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    boolean isPrime(int number) {
        if (number == 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Problem10();
    }
}
