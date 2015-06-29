import java.util.ArrayList;
import java.util.List;

/**
 * Created by NEX on 29/06/2015.
 */
public class Problem7 {

    public Problem7() {
        System.out.println(nthPrime(10001));
    }

    int nthPrime(int n) {
        int counter = 1;
        List<Integer> list = new ArrayList<Integer>();

        while (list.size() < n) {
            if (isPrime(counter)) {
                list.add(counter);
            }
            counter++;
        }
        return list.get(list.size()-1);
    }

    boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Problem7();
    }
}
