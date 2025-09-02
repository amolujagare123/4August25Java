package FinalNStatic;

public class Student2 {
   public int rno;
    public String name;
    public static String college = "ITS";

    public void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
   //     System.out.println("rno="+rno); // non-static - not allowed
    //    System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college); // static - allowed

        staticMethod2();  // static - allowed
     //   nonStaticMethod2(); // non-static - not allowed
   //     display(); // non-static - not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    public void nonStaticMethod2()
    {
        System.out.println("staticMethod2");
        System.out.println("staticMethod1");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name); // non-static -  allowed
        System.out.println("college="+college); // static - allowed

        staticMethod2();  // static - allowed
        nonStaticMethod2(); // non-static -  allowed
        display(); // non-static -  allowed
    }



    public static void main(String[] args) {

        Student2 s1 = new Student2();


    }
}
