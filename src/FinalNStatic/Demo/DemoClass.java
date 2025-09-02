package FinalNStatic.Demo;


import FinalNStatic.Student2;
import static FinalNStatic.Student2.college;
import static FinalNStatic.Student2.staticMethod1;
import static FinalNStatic.Student2.staticMethod2;

public class DemoClass {

    public static void main(String[] args) {

        Student2.college = "XYZ";
        Student2.staticMethod1();
        Student2.staticMethod2();

        college = "ABCD";
        staticMethod2();
        staticMethod1();

    }
}
