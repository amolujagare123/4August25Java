package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(12);
        al.add(30);
        al.add(24);
        al.add(52);

        System.out.println(al);

        Integer ii = 30;

        al.remove(ii);

        System.out.println(al);

    }
}
