package InheritanceDemo;

// Base class
class Animal2 {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Derived class 1
class Mammal extends Animal2 {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

// Derived class 2
class Reptile extends Animal2 {
    void crawl() {
        System.out.println("Reptiles can crawl.");
    }
}

// Multilevel Inheritance: Tiger → Mammal → Animal
class Tiger extends Mammal {
    void roar() {
        System.out.println("Tiger roars loudly.");
    }
}

// Main class
public class HybridInheritanceDemo {
    public static void main(String[] args) {

        // Animal object
        Animal a = new Animal();
        a.eat();

        // Mammal object
        Mammal m = new Mammal();
        m.eat();   // from Animal
        m.walk();

        // Reptile object
        Reptile r = new Reptile();
        r.eat();   // from Animal
        r.crawl();

        // Tiger object (Multilevel)
        Tiger t = new Tiger();
        t.eat();   // from Animal
        t.walk();  // from Mammal
        t.roar();  // Tiger’s own method
    }
}
