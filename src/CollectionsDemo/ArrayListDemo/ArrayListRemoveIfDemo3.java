package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo3 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList<>();

        for(char ch = 'a'; ch <= 'z'; ch++) {
            al.add(ch);
        }

        System.out.println(al);

        // remove all vowels - a,e,i,o,u

        al.removeIf(ch -> (ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u') ) ;

        System.out.println(al);

    }
}
