package programming.java.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Write a program to insert StringBuffer object into TreeSet, where all elements
 * should be inserted according to Alphabetical order.
 */

public class Demo3 {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s1.compareTo(s2);
    }
}
