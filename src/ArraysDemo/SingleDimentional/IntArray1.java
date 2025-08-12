package ArraysDemo.SingleDimentional;

public class IntArray1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 23;
        a[1] = 44;
        a[2] = 11;
        a[3] = 18;
        a[4] = 36;

        System.out.println("=======For loop========");

        for(int i=0;i<5;i++)
          System.out.println(a[i]);

        System.out.println("=======For each loop========");
        for(int x : a)
        {
            System.out.println(x);
        }

    }
}
