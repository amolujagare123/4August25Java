package Methods;

public class MethodArguments {

    void method1()
    {
        System.out.println("no arguments");
    }

    void method2(int a)
    {
        System.out.println("a="+a);
        System.out.println("Single arguments");
    }
    void method2(int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("Multiple / same arguments");
    }

    void method3(int a,double b,String c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("Different arguments");
    }

    void printMyArray(int[] arr)
    {
        System.out.println("==== Printing an array ===");
        for (int a:arr)
            System.out.println(a);
    }

    void printMyTwoDArray(String[][] stArr)
    {
        System.out.println("==== Printing 2D array ===");

        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++) {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        MethodArguments ob = new MethodArguments();
        ob.method1();
        ob.method2(12);
        ob.method2(12,34,56);
        ob.method3(12,3.4,"AMol");

        int[] x = {12,34,56,78,90};

        ob.printMyArray(x);

        String[][] names = {
                {"Amit", "Priya", "Raj"},
                {"Neha", "Vikram", "Kiran"},
                {"Anjali", "Rohit", "Sunita"},
                {"Manish", "Pooja", "Suresh"}
        };

        ob.printMyTwoDArray(names);
    }
}
