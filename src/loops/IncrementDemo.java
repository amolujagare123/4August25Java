package loops;

public class IncrementDemo {

    public static void main(String[] args) {

        /*
        * a++ , a- - : first statement is executed
        * then increment or decrement happens

        ++a , - -a : first increment or decrement happens
          then the statement is executed
        *
        * */

        int  i = 10;
        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i);// 12
        System.out.println(i); // 12
    }
}
