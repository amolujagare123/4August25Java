package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListAddAllDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Sidhhant");
        al.add("Amol");
        al.add("Sphurti");
        al.add("Prajakta");
        al.add("Vijetha");
        al.add("Prerna");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);








    }
}
