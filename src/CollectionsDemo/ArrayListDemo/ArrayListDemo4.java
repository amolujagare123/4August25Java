package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Sidhhant");
        al.add("Amol");
        al.add("Sphurti");
        al.add("Prajakta");
        al.add("Vijetha");
        al.add("Prerna");

        System.out.println(al);

        al.set(3,"sony");

        System.out.println(al);

    }
}
