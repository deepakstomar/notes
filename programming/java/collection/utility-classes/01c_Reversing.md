# Reversing

The `Collections` class provides method for reversing elements in a `List`:

1. `public static void reverse(List l)`
   - Reverse order of the `List` element.
2. `public static Comparator reverseOrder(Comparator c)`
   - We can use `reverseOrder` method to get reversed `Comparator`.
   - If supply ascending order `Comparator` then we will get descending order `Comparator`.

## Demo Code

```java
import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);

        System.out.println("Before Reversing:" + l); // [15, 0, 20, 10, 5]
        Collections.reverse(l);
        System.out.println("After Reversing: " + l); // [5, 10, 20, 0, 15]
    }
}
```
