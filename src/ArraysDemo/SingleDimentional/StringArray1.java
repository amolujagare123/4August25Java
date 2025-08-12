package ArraysDemo.SingleDimentional;

public class StringArray1 {

    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "David";
        names[4] = "Eva";

        System.out.println("=======For loop========");

        for(int i=0;i<names.length;i++)
            System.out.println(names[i]);

        System.out.println("=======For each loop========");
        for(String str : names)
        {
            System.out.println(str);
        }

    }
}
