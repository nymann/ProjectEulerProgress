/**
 * Created by NEX on 29/06/2015.
 */
public class Problem5 {
    public Problem5() {
        findLargestNumber();
    }

    void findLargestNumber() {
        int i = 2520;
        boolean a = true;
        while (a) {
            for (int j = 20; j > 0; j--) {
                if (i % j != 0) {
                    i++;
                    break;
                }

                if (j == 1) {
                    System.out.println(i);
                    a = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Problem5();
    }
}
