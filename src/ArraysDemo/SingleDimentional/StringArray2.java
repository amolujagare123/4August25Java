package ArraysDemo.SingleDimentional;

public class StringArray2 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva"};

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
