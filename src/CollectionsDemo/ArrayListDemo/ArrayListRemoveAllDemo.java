package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAllDemo {

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

        al2.add("Sphurti");
        al2.add("sahilesh");
        al2.add("Prajakta");
        al2.add("Nitin");
        al2.add("Vijetha");
        al2.add("Sayali");

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);








    }
}
