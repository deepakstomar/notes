package programming.java.collection.comparator;

/**
 * 1. Write a program to insert Integer object into the TreeSet, where the sorting order is Descending Order.**
*/

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;

        // return I1 < I2 ? 1 : I1 > I2 ? -1 : 0;
        if (I1 < I2)
            return +1;
        else if (I1 > I2)
            return -1;
        else
            return 0;
    }

}

public class Demo1 {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}
