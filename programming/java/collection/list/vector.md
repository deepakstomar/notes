# Vector Class

## Overview

- **Underlying data structure:** Resizable array (growable array)
- **Duplicate objects:** Allowed
- **Insertion order:** Preserved
- **Heterogeneous objects:** Allowed
- **Null insertion:** Possible

## Key Characteristics

**Use when:**

- Frequent operation is retrieval

**Don't use when:**

- Frequent operations are insertion or removal

## Constructors

- **`Vector v = new Vecotr()`**
  - Creates an empty Vector with a default initial capacity of 10.
  - Capacity is expanded as needed: `new capacity = current capacity * 2`
- **`Vector v = new Vector(int initialCapacity)`**
  - Creates an empty Vector with the specified initial capacity.
- **`Vector v = new Vector(int initialCapacity, int incrementalCapacity)`**
  - Creates an empty Vector with the specified initial capacity and incremental Cpapcity.
- **`Vector v = new Vector(Collection c);`**
  - Creates an Vector containing the elements of the given collection.

## Vector class specific Methods

**Adding Elements:**

- `addElement(Object o)`: Adds a single element to the collection.

**Removing Elements:**

- `removeElement(Object o)`: Removes a single element if present.
- `removeElementAt(int index)`: Removes a single element at the specified `index` if present, otherwise returns `null`.
- `removeAllElements()`: Removes all elements from the collection.

**Retriving Elements:**

- `Object elementAt(int index)`: Returns the element at the specified `index`.
- `Object firstElement()`: Returns the first element in the list.
- `Object lastElement()`: Returns the last element in the list.

**Other:**

- `int size()`: Returns how many elements present in collection.
- `int capacity()`: Returns how many elements collection can hold.
- `Enumeration elements()`: Return Enumeration for iterating over vector.

## Important Notes

- **Serializable and Cloneable:** Collection classes implement `Serializable` and `Cloneable` for object transfer and duplication.
- **RandomAccess Interface:** `ArrayList` and `Vector` implements `RandomAccess` for efficient random element access.
  - `RandomAccess` is a marker interface (no methods) present in `java.util` package. The `JVM` provides the required capability.

## ArrayList vs. Vector

| Feature         | ArrayList                                    | Vector                                        |
| --------------- | -------------------------------------------- | --------------------------------------------- |
| Synchronization | Non-synchronized methods                     | Synchronized methods                          |
| Thread Safety   | Not thread-safe (multiple thread can access) | Thread-safe (one thread can access at a time) |
| Performance     | Relatively high (no thread waiting)          | Relatively low (due to thread waiting)        |
| Introduction    | Java 1.2                                     | Java 1.0 (legacy)                             |

## Demo Code

```java
class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());   // 10

        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());   // 10

        v.addElement(11);
        System.out.println(v.capacity());   // 20

        System.out.println(v);  // [1, 2....10, 11]
    }
}
```
