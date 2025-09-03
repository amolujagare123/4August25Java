package CollectionsDemo.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Sidhhant");
        ll.add("Amol");
        ll.add("Sphurti");
        ll.add("Prajakta");
        ll.add("Vijetha");
        ll.add("Prerna");

        System.out.println("al="+ll);

        ll.addFirst("First");
        ll.addLast("last");

        System.out.println("al="+ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("al="+ll);








    }
}
