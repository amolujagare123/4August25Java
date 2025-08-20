package AbstractionDemo;

public interface InterfaceDemo {

     void run();
     void start();

     default void display1()
     {
         System.out.println("Display 1");
     }

     private void display2()
    {
        System.out.println("Display 2");
    }

    static void display3()
    {
        System.out.println("Display 3");
    }
}

class ChildInterface implements InterfaceDemo
{
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        System.out.println("start");
    }
}
