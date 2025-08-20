package FinalNStatic;

public class FinalDemo {

    final int speed = 200;

    void change()
    {
      //  speed = 500;
    }

    public static void main(String[] args) {
        FinalDemo ob = new FinalDemo();
        ob.change();
        System.out.println(ob.speed);
    }
}
