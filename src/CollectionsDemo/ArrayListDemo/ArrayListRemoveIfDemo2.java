package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(12);
        al.add(30);
        al.add(24);
        al.add(52);

        System.out.println(al);

       // remove all the elements which are divisible by 3

        //    al.removeIf( str -> str.startsWith("P")   ) ;

        al.removeIf( i -> i%3==0) ;

        System.out.println(al);

    }
}
