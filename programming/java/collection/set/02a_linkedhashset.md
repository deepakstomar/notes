# LinkedHashSet Class

It is the child class of `HashSet`.

It is exactly same as `HashSet` (include contructors and methods). Except the following differences

| Property                  | HashSet         | LinkedHashSet                           |
| ------------------------- | --------------- | --------------------------------------- |
| Underlying data structure | HashTable       | combinaiton of LinkedList and HashTable |
| Insertion order           | Not preservered | Preservered                             |
| Introduction              | Java 1.2        | Java 1.4                                |

## Demo Code

```java
import java.util.LinkedHashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add("null");
        h.add(10);

        System.out.println(h.add("Z")); // false
        System.out.println(h); // [B, C, D, Z, null, 10]
    }
}
```

:bulb:**Note:**

In general, we can use `LinkedHashSet` to develop **cache-based** applications where duplicates are not allowed and insertion order is preserved.
