package loops;

public class FactorialDemo {

    public static void main(String[] args) {

        int n = 6;
        int result = 1;

        for(int i=n ; i>=1 ; i--)
        {
            result = result * i;
        }

        System.out.println("Factorial="+result);

    }
}
