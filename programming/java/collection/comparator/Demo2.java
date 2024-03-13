package programming.java.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Write a program to insert String object into TreeSet, where all elements
 * should be inserted according to reverse of Alphabetical order.
 */

public class Demo2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        // t.add("Deepak");
        t.add("Prakash");
        t.add("Yogesh");
        t.add("Bhoomi");
        t.add("Sachin");
        System.out.println(t);
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2; // use to convert to String

        // return -s1.compareTo(s2);
        return s2.compareTo(s1);
    }
}