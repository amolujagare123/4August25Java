package ClaseesNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str; // Data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        int x;
        x = 10 ;

        MyClass ob = new MyClass();
        ob.a = 10;
        ob.d = 45.67;
        ob.c = 'g';
        ob.str = "Amol";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 110;
        ob2.d = 415.67;
        ob2.c = 'c';
        ob2.str = "Java";
        ob2.display();
    }
}
