# ArrayList Class

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

- **`ArrayList l = new ArrayList();`**
  - Creates an empty ArrayList with a default initial capacity of 10.
  - Capacity is expanded as needed: `new capacity = (current capacity * 3/2) + 1`
- **`ArrayList l = new ArrayList(int initialCapacity);`**
  - Creates an empty ArrayList with the specified initial capacity.
- **`ArrayList l = new ArrayList(Collection c);`**
  - Creates an ArrayList containing the elements of the given collection.

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

## Synchronized ArrayList

- **Convert a non-synchronized ArrayList to a synchronized one:**

  ```java
  ArrayList l = new ArrayList(); // Non-synchronized
  List l1 = Collections.synchronizedList(l); // Synchronized
  ```
