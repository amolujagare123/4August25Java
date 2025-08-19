package InheritanceDemo.Polymorphism;

public class Addition {
    int a;
    int b;

    void add()
    {
        int c = a + b;
        System.out.println("c="+c);
    }

    void add(int x , int y)
    {
        int c = x + y;
        System.out.println("c="+c);
    }

    void add(int x , int y , int z)
    {
        int c = x + y + z;
        System.out.println("c="+c);
    }

    void add(double x , double y)
    {
        double c = x + y ;
        System.out.println("c="+c);
    }

    void add(String x , String y)
    {
        String c = x + y ;
        System.out.println("c="+c);
    }


    public static void main(String[] args) {
        Addition ob = new Addition();
        ob.a = 10;
        ob.b = 20;
        ob.add();
        ob.add(11,11);
        ob.add(11,11,11);
        ob.add(23.45,25.78);
        ob.add("Java","Selenium");
    }
}
