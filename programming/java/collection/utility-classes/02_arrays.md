# Arrays

The `Arrays` class is a static utility class that provides a variety of convenience methods for working with arrays in Java. These methods are not part of the `Array` itself but are accessible using `Collections`.

## Methods

**Common methods provided by the `Collections` class:**

### Sorting

1. `public static void sort(primitive[] p)`
   - To sort according to natural sorting order.
2. `public static void sort(Object[] o)`
   - To sort according to natual sorting order.
3. `public static void sort(Object[] o, Comparator c)`
   - To sort according to customized sorting order.

> :bulb:We can sort primitive array only based on default natural sorting array, where as we can sort object array either based on default natural order or based on customized sorting order.

#### Demo Code

```java
import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {

    public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 11, 6 };
        System.out.println("Primitive Array Before Sorting: ");
        for (int number : numbers) {
            System.out.print(number + " "); // 10, 5, 20, 11, 6
        }
        System.out.println();
        System.out.println();
        Arrays.sort(numbers);
        System.out.println("Primitive Array After Sorting: "); // 0, 5, 6, 10, 20
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();

        String[] strings = {"A", "Z", "B"};
        System.out.println("Object Array Before Sorting: ");
        for(String s : strings) {
            System.out.print(s + " "); // A, Z, B
        }
        System.out.println();
        System.out.println();
        Arrays.sort(strings);
        System.out.println("Object Array After Sorting: ");
        for(String s : strings) {
            System.out.print(s + " "); // A, B, Z
        }
        System.out.println();
        System.out.println();

        Arrays.sort(strings, new MyComparator());
        System.out.println("Object Array After Sorting by Comparator: ");
        for(String s : strings) {
            System.out.print(s + " "); // Z, B, A
        }
        System.out.println();
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
