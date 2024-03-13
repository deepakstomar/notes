# Searching

The `Collections` class provides two methods for searching elements in a `List`:

1. `public static int binarySearch(List l, Object target)`
    - Use this method when the `List` is sorted in the **default natural sorting order**.

2. `public static int binarySearch(List l, Object target, Comparator c)`
   - Use this method when the `List` is sorted in a **customized sorting order**.

## Key Points

1. These methods internally use the Binary Search Algorithm.
2. A successful search returns the **index** of the element.
3. An unsuccessful search returns the **insertion point**:
   - The **insertion point** is where the target element can be placed in the sorted list.
4. Before calling the `binarySearch()` method, ensure that the list is sorted, or else you may get unpredictable results.
5. If the `List` is sorted using a `Comparator`, you must pass the same `Comparator` object during the search operation to ensure predictable results.

## Demo Code

```java
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo1 {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");

        System.out.println("Before Sorting:" + l); // [Z, A, M, K, A]
        Collections.sort(l);
        System.out.println("After Sorting: " + l); // [A, K, M, Z, a]

        /*
        * Insertion point -->    -1  -2  -3  -4  -5
        *                       | A | K | M | Z | a |
        * Index ------------>     0   1   2   3   4
        */

        System.out.println(Collections.binarySearch(l, "Z")); // prints --> 3
        System.out.println(Collections.binarySearch(l, "J")); // prints --> -2
    }
}
```

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);

        System.out.println("Before Sorting:" + l); // [15, 0, 20, 10, 5]
        Collections.sort(l, new MyComparator());
        System.out.println("After Sorting: " + l); // [20, 15, 10, 5, 0]

        /*
        * Insertion point -->     -1   -2   -3  -4  -5
        *                       | 20 | 15 | 10 | 5 | 0 |
        * Index ------------>     0    1    2    3   4
        */

        System.out.println(Collections.binarySearch(l, 10, new MyComparator())); // 2
        System.out.println(Collections.binarySearch(l, 13, new MyComparator())); // -3
        System.out.println(Collections.binarySearch(l, 17)); // Unpredictable
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;
        return I2.compareTo(I1);
    }
}
```

**For `List` of n elements:**

1. Successful search result range: 0 to n-1
2. Unsuccessful search result range: -(n+1) to -1
3. Total result range: -(n+1) to n-1

**Example:**

```plain text
Insertion Point -->            -1      -2      -3    -4
                            ++++++++++++++++++++++++++
                            |   A   |    C   |   D   |
                            ++++++++++++++++++++++++++
Index -->                       0        1       2

Successfull search result range: 0 to 2
UnSuccessfull Search result range: -4 to -1
Total result range: -4 to 2
```
