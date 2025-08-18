package ClaseesNConstructors.pack1;

public class Java1 {

    public int a;
    private double d;
    protected char c;
    String str; // Data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 10;
        ob.d = 45.67;
        ob.c = 'g';
        ob.str = "Amol";
        ob.display();


    }
}
