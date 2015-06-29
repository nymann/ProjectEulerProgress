/**
 * Created by NEX on 30/06/2015.
 */
public class Problem9 {
    public Problem9(){
        generatePythagoreanTriplet();
    }

    void generatePythagoreanTriplet() {
        int a;
        int b;
        int c;

        // Using Euclid's formula a = m²-n², b = 2mn, c = m² + n², where m > n and m or n [0;infinity[
        loop:
        for (int n = 1; n < 1000; n++) {
            for (int m = (n + 1); m < 1000; m++) {
                a = (int) (Math.pow(m, 2) - Math.pow(n, 2));
                b = 2 * m * n;
                c = (int) (Math.pow(m, 2)) + (int) (Math.pow(n, 2));

                if (a + b + c == 1000) {
                    System.out.println(a + " + " + b + " + " + c + " = " + "1000");
                    System.out.println(a + " * " + b + " * " + c + " = " + (a*b*c));
                    break loop;
                }
            }
        }
    }

    public static void main(String[] args){
        new Problem9();
    }
}
