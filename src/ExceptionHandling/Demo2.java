package ExceptionHandling;

public class Demo2 {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 11;
            a[1] = 11;
            a[2] = 11;
            a[3] = 11;
            a[4] = 11;
            a[5] = 11;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
