package programming.java.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Write a program to insert String and StringBuffer objects into TreeSet, where sorting order is increasing length order.
 * If two object having same length then consider their alphabetical order.
 */
public class Demo4 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t);
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 = s1.length();
        int l2 = s2.length();

        return l1 < l2 ? -1 : l1 > l2 ? 1 : s1.compareTo(s2);
    }
}