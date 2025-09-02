package Methods;

public class MethodReturningValue {

    int myMethod()
    {
        System.out.println("My Method");;
        int a = 10;
        return a;
    }

    String reverseString(String myString)
    {
        String temp = "";

        for (int i=(myString.length()-1) ; i>=0 ; i--   )
        {
            temp = temp + myString.charAt(i) ;
        }

        return temp;
    }

    int[] getMyArray()
    {
        int[] a = {12,34,56,78,11};
        return a;
    }

    String[][] getMyTwoDArray()
    {
        String[][] names = {
                {"Amit", "Priya", "Raj"},
                {"Neha", "Vikram", "Kiran"},
                {"Anjali", "Rohit", "Sunita"},
                {"Manish", "Pooja", "Suresh"}
        };

        return names;
    }

    public static void main(String[] args) {

        int a  = 12;
        a = 12;

        System.out.println(a);
        int x = a;

        System.out.println("x="+x);

        MethodReturningValue ob = new MethodReturningValue();

        ob.myMethod(); // 10

        System.out.println("ob.myMethod()="+ob.myMethod());

        int y = ob.myMethod();

        System.out.println("y="+y);


        String str = "Sachin";

        String str2 = ob.reverseString(str);

        System.out.println(str);
        System.out.println(str2);

        int[] aa = ob.getMyArray();

        System.out.println("This is the array");
        for (int xx:aa)
            System.out.println(xx);


        String[][] myArray = ob.getMyTwoDArray();
        System.out.println("==== Printing 2D array ===");

        for (int i=0;i<myArray.length;i++)
        {
            for (int j=0;j<myArray[0].length;j++) {
                System.out.print(myArray[i][j]+"\t");
            }
            System.out.println();
        }

    }



}
