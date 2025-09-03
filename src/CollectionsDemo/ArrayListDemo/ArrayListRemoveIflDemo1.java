package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIflDemo1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Sidhhant");
        al.add("Amol");
        al.add("Sphurti");
        al.add("Prajakta");
        al.add("Vijetha");
        al.add("Prerna");

        System.out.println("al="+al);

        // remove the elements that starts with 'P'
        // -> predicate Symbol

    //    al.removeIf( str -> str.startsWith("P")   ) ;

        // remove the elements whose length is less than 5
        al.removeIf( str -> str.length() < 5);
        System.out.println("al="+al);









    }
}
