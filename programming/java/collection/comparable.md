# Comparable Interface

The `Comparable` interface is present in the `java.lang` package and it contains only **one** method, `compareTo()`.

**`public int compareTo(Object o)`:**

This method compares the current object (`this`) with the specified object (`o`) for order. It returns an integer value based on the comparison:

**`obj1.compareTo(obj2)`:**

- Returns a negative value (`-ve`) if the current object (`obj1`) is less than the specified object (`obj2`). This means the current object should come before the specified object in a sorted order.
- Returns a positive value (`+ve`) if the current object (`obj1`) is greater than the specified object (`obj2`). This means the current object should come after the specified object in a sorted order.
- Returns `0 (zero)` if the current object (`obj1`) is equal to the specified object (`obj2`).

## Demo Code

```java
public class Test {

    public static void main(String[] args) {
       System.out.println("A".compareTo("Z")); // -ve
       System.out.println("Z".compareTo("K")); // +ve
       System.out.println("A".compareTo("A")); // 0
    }
}
```

## Using Comparable with TreeSet

If we depending on default natural sorting order, while inserting object into the `TreeSet` `JVM` will call `compareTo` method.

```java
TreeSet t = new TreeSet();
t.add("K");
t.add("Z");
t.add("A");
t.add("A");
System.out.println(t) // [A, K, Z]

/*
* JVM in background
* obj1.compareTo(obj2)
* obj1 --> Object, which is to be inserted
* obj2 --> Object, which is already inserted
*       K
*     /  \
*   A     Z
*/
```
