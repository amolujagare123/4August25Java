package ExceptionHandling;

public class NumberDemo {

    void checkNumber(int i)
    {
        if(i<=10 && i>=1)
            System.out.println("we are safe");
        else
            throw  new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        int a = 12;
        System.out.println("a="+a);

        NumberDemo ob = new NumberDemo();
        ob.checkNumber(a);

        System.out.println("End of the program");
    }
}
