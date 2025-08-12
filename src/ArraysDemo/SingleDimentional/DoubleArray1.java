package ArraysDemo.SingleDimentional;

public class DoubleArray1 {

    public static void main(String[] args) {

        double[] a = new double[5];

        a[0] = 23.56;
        a[1] = 44.67;
        a[2] = 11.12;
        a[3] = 18.11;
        a[4] = 36.55;

        System.out.println("length = "+a.length);

        System.out.println("=======For loop========");

        for(int i=0;i<a.length;i++)
          System.out.println(a[i]);

        System.out.println("=======For each loop========");

        for(double x : a)
            System.out.println(x);

    }
}
