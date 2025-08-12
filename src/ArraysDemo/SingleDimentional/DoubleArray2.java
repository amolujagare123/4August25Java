package ArraysDemo.SingleDimentional;

public class DoubleArray2 {

    public static void main(String[] args) {

        double[] a = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};


        System.out.println("length = "+a.length);

        System.out.println("=======For loop========");

        for(int i=0;i<a.length;i++)
          System.out.println(a[i]);

        System.out.println("=======For each loop========");

        for(double x : a)
            System.out.println(x);

    }
}
