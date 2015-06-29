import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by NEX on 29/06/2015.
 */
public class Problem4 {
    public Problem4() {
        sortList(numbersToTest());
    }

    List numbersToTest() {
        List<Integer> arrayList = new ArrayList<Integer>();

        loop:
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 100; j--) {
                int result = i * j;
                if (isPalindrome(result)) {
                    if (result == 906609) {
                        System.out.println(i + ", " + j);
                    }
                    //System.out.println("Palindrome = " + i + " * " + j + " = " + result);
                    arrayList.add(result);
                }
            }
        }

        return arrayList;
    }

    boolean isPalindrome(int number) {
        String convert = Integer.toString(number);
        return convert.equals(new StringBuffer().append(convert).reverse().toString());
    }

    void sortList(List list) {
        //Collections.sort(list);
        //System.out.println(list.get(list.size() - 1));

        // Could've also used Collections.max(list)
        System.out.println(Collections.max(list));
    }

    public static void main(String[] args) {
        new Problem4();
    }
}
