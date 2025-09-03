package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add("Sidhhant");
        al.add("Amol");
        al.add("Sphurti");
        al.add("Prajakta");
        al.add("Vijetha");
        al.add("Prerna");
        System.out.println(al.isEmpty()); // false

        System.out.println(al);
        System.out.println(al.size());

        System.out.println("=== using for loop ===");
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("=== using for each loop ===");
        for(String str:al)
            System.out.println(str);

        System.out.println("=== using Iterator Interface ===");

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());


        al.clear();

        System.out.println(al);

    }
}
