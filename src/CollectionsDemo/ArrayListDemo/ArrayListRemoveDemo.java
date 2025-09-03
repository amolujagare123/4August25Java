package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Sidhhant");
        al.add("Amol");
        al.add("Sphurti");
        al.add("Prajakta");
        al.add("Vijetha");
        al.add("Prerna");

        System.out.println(al);

      //  al.remove("Vijetha");
        al.remove(4);

        System.out.println(al);

    }
}
