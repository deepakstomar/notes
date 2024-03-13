# LinkedHashMap Class

It is the child class of `HashMap`.

It is exactly same as `HashMap` (include contructors and methods). Except the following differences

| Property                  | HashMap         | LinkedHashMap                           |
| ------------------------- | --------------- | --------------------------------------- |
| Underlying data structure | HashTable       | combinaiton of LinkedList and HashTable |
| Insertion order           | Not preservered | Preservered                             |
| Introduction              | Java 1.2        | Java 1.4                                |

> :bulb:**Note:**
>
> In general, we can use `LinkedHashMap` to develop **cache-based** applications where duplicates are not allowed and insertion order is preserved.

## Demo Code

```java
import java.util.LinkedHashMap;

public class HashMap {

    public static void main(String[] args) {
        LinkedHashMap m = new LinkedHashMap();
        m.put("Deepak", 100000);
        m.put("Prakash", 200000);
        m.put("Ceaser", 50000);
        m.put("Ronnie", 30000);

        System.out.println(m);
    }
}
```
