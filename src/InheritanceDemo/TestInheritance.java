package InheritanceDemo;

// Parent Class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child Class of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child Class of Dog (Grandchild of Animal)
class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

// Main Class
public class TestInheritance {
    public static void main(String[] args) {
        // Object of Animal
        Animal a = new Animal();
        a.eat();

        // Object of Dog
        Dog d = new Dog();
        d.bark();
        d.eat();

        // Object of BabyDog
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
