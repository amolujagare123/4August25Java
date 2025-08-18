package ClaseesNConstructors;

public class MyClass3 {

    int a;
    double d;
    char c;
    String str; // Data members
/*

    MyClass2() // empty constructor
    {

    }
*/

    MyClass3(int a1,double d1,char c1,String str1) // parameterized constructor
    {
        a = a1;
        d = d1;
        c= c1;
        str = str1;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3(11,34.56,'f',"amol");

        ob.display();
    }
}
