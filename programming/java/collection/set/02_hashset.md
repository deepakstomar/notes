# HashSet Class

The HashSet class in Java provides a collection that implements the Set interface. It utilizes a hash table for efficient storage and retrieval of elements.

## Overview

- **Underlying data structure:** HashTable
- **Duplicate objects:** Not Allowed
- **Insertion order:** Not Preserved (based on hash code of objects)
- **Heterogeneous objects:** Allowed
- **Null insertion:** Possible

## Key Characteristics

**Use when:**

- Frequent operation is search

**Avoid when:**

- Frequent operations are insertion or removal

```java
/*
* Adding duplicates won't result in compile or runtime errors,
* but the `add` method will return `false`.
*/
HashSet h = new HashSet();
System.out.println(h.add("Deepak")); // true
System.out.println(h.add("Deepak")); // false
```

## Constructors

- **`HashSet h = new HashSet()`**

  - Creates an empty HashSet with a default initial capacity of 16.
  - Default **fill ratio (load factor)** 0.75.

  :bulb:**Note:** Fill Ratio / Load Factor

  After filling how much ratio a new HashSet object will be created, this is ratio is called Fill Ratio or Load Factor. For example Fill Ratio 0.75 mean, after filling 75% ratio a new HashSet object will be created.

- **`HashSet h = new HashSet(int initialCapacity)`**
  - Creates an empty HashSet with the specified initial capacity.
  - Default **fill ratio (load factor)** 0.75.
- **`HashSet h = new HashSet(int initialCapacity, float fillRatio)`**
  - Creates an empty HashSet with the specified initial capacity.
  - And sepecified **fill ratio (load factor)**.
- **`HashSet h = new HashSet(Collection c)`**
  - Creates an HashSet containing the elements of the given collection.

## Important Notes

- **Serializable and Cloneable:** Collection classes implement `Serializable` and `Cloneable` for object transfer and duplication.
- **RandomAccess Interface:** `HashSet` does not implements `RandomAccess`.

## Demo Code

```java
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add("null");
        h.add(10);

        System.out.println(h.add("Z")); // false
        System.out.println(h); // unordered, can't tell output
    }
}
```
