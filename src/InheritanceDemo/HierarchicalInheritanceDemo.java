package InheritanceDemo;

// Base class
class Bird {
    void fly() {
        System.out.println("All birds can fly.");
    }
}

// Derived class 1
class Sparrow extends Bird {
    void sparrowColor() {
        System.out.println("Sparrow is brown in color.");
    }
}

// Derived class 2
class Crow extends Bird {
    void crowColor() {
        System.out.println("Crow is black in color.");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        // Bird object
        Bird b = new Bird();
        b.fly();

        // Sparrow object
        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        // Crow object
        Crow c = new Crow();
        c.crowColor();
        c.fly();
    }
}
