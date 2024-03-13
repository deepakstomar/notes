# TreeSet ClassThe

`TreeSet` class in Java provides a set implementation that utilizes a balanced tree for efficient storage and retrieval of elements.

## Overview

It offers the following key characteristics:

- **Underlying Data Structure:** Balanced Tree (ensures efficient operations)
- **Duplicate Objects:** Not Allowed (maintains unique elements)
- **Insertion Order:** Not Preserved (elements are sorted)
- **Heterogeneous Objects:** Not Allowed (elements must be comparable)
  - Attempting to add incompatible objects will result in a `ClassCastException` at runtime.
- **Null Insertion:** Allowed (only once as a special case)

Elements within a `TreeSet` are automatically inserted and maintained in a specific sorting order. This order can be:

- **Default Natural Ordering:** Based on the element's `compareTo` method implementation (if it implements `Comparable`).
- **Customized Sorting Order:** Defined using a custom `Comparator` object provided during `TreeSet` creation.

## Constructors

**1. `TreeSet t = new TreeSet()`**

- Creates an empty `TreeSet` object.
- Elements will be inserted according to the default natural sorting order of their types (using the `compareTo` method if they implement `Comparable`).

**2. `TreeSet t = new TreeSet(Comparator c)`**

- Creates an empty `TreeSet` object.
- Elements will be inserted according to the customized sorting order specified by the provided `Comparator` object.

**3. `TreeSet t = new TreeSet(Collection c)`**

- Creates a new `TreeSet` object containing all the elements from the given `Collection` (e.g., `ArrayList`, `HashSet`).
- Elements will be sorted according to their natural order.

**4. `TreeSet t = new TreeSet(SortedSet s)`**

- Creates a new `TreeSet` object containing all the elements from the given `SortedSet` (e.g., another `TreeSet`).
- Elements will maintain the same sorting order as in the original `SortedSet`.

> :bulb: Important Notes
>
> **Serializable and Cloneable:** Like other collection classes in Java, `TreeSet` implements the `Serializable` and `Cloneable` interfaces. This allows for serialization of `TreeSet` objects for persistence and cloning them to create new instances with independent but identical content.
>
> **Null Acceptance:** Java 1.7 onward null is not allowed even as the first element.
>
> if we are depending on default sorting order then compalsory that object shuld be Homogenious and Comparable otherwise we will get RuntimeException saying ClassCastException.
>
> an Object is said to be Compairable if and only if corresponding class implements Compairable interface.
>
> String class and all Wrapper classes already implements Compairable interface, but StringBuffer class doesn't implements Comparable interface. otherwise we will get RE: Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.StringBuffer cannot be cast to java.base/java.lang.Comparable

## Null Acceptance

**Non-empty TreeSet:**

- If try to insert null, then we will get `NullPointerException`.

**Empty TreeSet:**

- As a special case, only in an empty `TreeSet` is null allowed as the first element.
- After inserting null, if you try to insert any other object, you will get a runtime exception (`NullPointerException`).

## Demo Code

```java
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A"); // ascii value of A --> 65
        t.add("a"); // ascii value of a --> 97
        t.add("B");
        t.add("Z");
        t.add("L");
        // t.add(new Integer(10)); // ClassCast Exception
        // t.add(null); // NullPointer Exception

        System.out.println(t); // [A, B, L, Z, a]
    }
}
```
