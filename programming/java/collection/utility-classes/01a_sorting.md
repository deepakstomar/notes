# Sorting

`Collections` class defines several utility methods for `Collection` objects, like **sorting**, **searching**, **reversing** etc.

## Sorting Elements of List

The `Collections` class provides two methods for sorting elements in a `List`:

1. **`public static void sort(List l)`**
    - Sorts elements based on their **natural ordering**.
    - The `List` must contain **homogeneous** (same type) objects that implement the `Comparable` interface. Otherwise, a `ClassCastException` will be thrown.
    - The `List` should not contain `null` elements. Otherwise, a `NullPointerException` will be thrown.

2. **`public static void sort(List l, Comparator c)`**
    - Sorts elements based on a **custom comparator**. This allows you to define your own sorting logic.

## Demo Code

**Program for sorting elements of list according to default natual sorting order.**

```java
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo1 {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");

        // l.add(10); // ClassCastException
        // l.add(null); // NullPointerException

        System.out.println("Before Sorting:" + l); // [Z, A, K, N]
        Collections.sort(l);
        System.out.println("After Sorting: " + l); // [A, K, N, Z]
    }
}
```

**Program for sorting elements of list according to customized sorting order.**

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");

        // l.add(10); // ClassCastException
        // l.add(null); // NullPointerException

        System.out.println("Before Sorting:" + l); // [Z, A, K, N]
        Collections.sort(l, new MyComparator());
        System.out.println("After Sorting: " + l); // [Z, N, K, A]
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}

```
