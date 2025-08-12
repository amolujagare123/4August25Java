package loops;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int sum = 0;

        // Print first two numbers
        System.out.print(a + " " + b);

        // Start loop from 3rd term
        for (int i = 3; i <= n; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
