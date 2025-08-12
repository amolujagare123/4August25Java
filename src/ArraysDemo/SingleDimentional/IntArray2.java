package ArraysDemo.SingleDimentional;

public class IntArray2 {

    public static void main(String[] args) {

        int[] a = {12,45,6,7,88,12,34,56,78,99};

        System.out.println("=======For loop========");

        for(int i=0;i<a.length;i++)
          System.out.println(a[i]);

        System.out.println("=======For each loop========");
        for(int x : a)
        {
            System.out.println(x);
        }

    }
}
