package ClaseesNConstructors;

public class MyClass4 {

    int a;
    double d;
    char c;
    String str; // Data members
/*

    MyClass2() // empty constructor
    {

    }
*/

    MyClass4(int a, double d, char c, String str) // parameterized constructor
    {
        this.a = a;
        this.d = d;
        this.c= c;
        this.str = str;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass4 ob = new MyClass4(11,34.56,'f',"amol");

        ob.display();
    }
}
