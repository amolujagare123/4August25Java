package AbstractionDemo;

public interface Interface2 {

    void run();
    void start();
    void display();

    default void action()
    {
        System.out.println("action");
    }

}

interface AnotherInterface {

    void display();
}

class ChildInterface2 implements Interface2,AnotherInterface
{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {


        Interface2 ob1 = new ChildInterface2();
        ob1.display();

        AnotherInterface ob2 = new ChildInterface2();
        ob2.display();


    }
}

