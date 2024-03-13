# Searching

`Arrays` class defines following `Binary Search` methods.

1. `public static int binarySerach(primitive[] p, primitive target)`
    - Use this method when the primitive `Array` is sorted in the **default natural sorting order**.
2. `public static int binarySearch(Object[] o, Object target)`
    - Use this method when the object `Array` is sorted in a **default natual sorting order**.
3. `public static int binarySearch(Object[] o, Object target, Comparator c)`
    - Use this method when the `Array` is sorted in a **customized sorting order**.

## Key Points

1. These methods internally use the Binary Search Algorithm.
2. A successful search returns the **index** of the element.
3. An unsuccessful search returns the **insertion point**:
   - The **insertion point** is where the target element can be placed in the sorted list.
4. Before calling the `binarySearch()` method, ensure that the list is sorted, or else you may get unpredictable results.
5. If the `Array` is sorted using a `Comparator`, you must pass the same `Comparator` object during the search operation to ensure predictable results.

## Demo Code

```java
import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

    public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 11, 6 };
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 6)); // 1
        System.out.println(Arrays.binarySearch(numbers,14)); // -5

        String[] strings = {"A", "Z", "B"};
        Arrays.sort(strings);
        System.out.println(Arrays.binarySearch(strings, "Z")); // 2
        System.out.println(Arrays.binarySearch(strings, "S")); // -3

        Arrays.sort(strings, new MyComparator());
        System.out.println(Arrays.binarySearch(strings, "Z", new MyComparator())); // 0
        System.out.println(Arrays.binarySearch(strings, "S", new MyComparator())); // -2
        System.out.println(Arrays.binarySearch(strings, "N")); // unpredictable result

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
