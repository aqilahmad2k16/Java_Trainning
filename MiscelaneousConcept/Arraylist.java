package MiscelaneousConcept;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list.size());
        list.add(10);
        list.add(11);
        list.add(11);

        System.out.println(list.size());
    }
}
