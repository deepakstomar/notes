# HashMap Class

The `HashMap` class in Java implements the `Map` interface and utilizes a `Hashtable` for efficient storage and retrieval of elements. It offers fast access based on keys.

## Overview

- **Underlying Data Structure:** Hashtable
- **Duplicate Keys:** Not allowed (a key can only map to one value)
- **Duplicate Values:** Allowed (multiple keys can map to the same value)
- **Insertion Order:** Not preserved (elements are stored based on their hash codes)
- **Heterogeneous Objects:** Allowed (both keys and values can be of different types)
- **Null Insertion:** Possible (only once for key)
- **Serializable and Cloneable:** Implemented
- **RandomAccess Interface:** Not implemented (elements are not stored in a specific order)

## Key Characteristic

> **ideal:** frequent operation is search
>
> **avoid:** insertion order is important

## Constructor

1. `hashmap m = new hashmap()`

   - creates an empty hashmap with a default initial capacity of 16.
   - default **fill ratio (load factor)** 0.75.

   :bulb:**note:** fill ratio (load factor)

   after filling how much ratio a new hashmap object will be created, this is ratio is called fill ratio or load factor. for example fill ratio 0.75 mean, after filling 75% ratio a new hashmap object will be created.

2. `hashmap m = new hashmap(int initialcapacity)`

   - creates an empty hashmap with the specified initial capacity.
   - default **fill ratio (load factor)** 0.75.

3. `hashmap m = new hashmap(int initialcapacity, float fillratio)`

   - creates an empty hashmap with the specified initial capacity.
   - and sepecified **fill ratio (load factor)**.

4. `hashmap m = new hashmap(map m)`
   - creates an hashset containing the elements of the given collection.

## Synchronized HashMap

- **Convert a non-synchronized HashMap to a synchronized one:**

  ```java
  HashMap m = new HashMap(); // Non-synchronized
  Map m1 = Collections.synchronizedList(m); // Synchronized
  ```

## Demo Code

```java
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {

    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Deepak", 100000);
        m.put("Prakash", 200000);
        m.put("Ceaser", 50000);
        m.put("Ronnie", 30000);

        System.out.println(m);

        System.out.println(m.put("Deepak", 200000));

        Set s = m.keySet();
        System.out.println(s);

        Collection c = m.values();
        System.out.println(c);

        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + "-->" + m1.getValue());

            if (m1.getKey().equals("Deepak")) {
                m1.setValue(500000);
            }
        }

        System.out.println(m);
    }
}
```
