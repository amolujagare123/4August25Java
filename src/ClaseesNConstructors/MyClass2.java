package ClaseesNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str; // Data members
/*

    MyClass2() // empty constructor
    {

    }
*/

    MyClass2() // constructor
    {
        a =90;
        d = 8.90;
        c='a';
        str = "Selenium";
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();

        ob.display();
    }
}
