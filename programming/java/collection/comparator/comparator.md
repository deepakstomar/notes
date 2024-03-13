# Comparator

The `Comparable` interface is present in the `java.lang` package and it contains two method, `compare()` and `equals`.

**`public int compare(Object obj1, Object obj2)`:**

This method compares the current object (`obj1`) with the specified object (`obj2`) for order. It returns an integer value based on the comparison:

- Returns a negative value (`-ve`) if the current object (`obj1`) is less than the specified object (`obj2`). This means the current object should come before the specified object in a sorted order.
- Returns a positive value (`+ve`) if the current object (`obj1`) is greater than the specified object (`obj2`). This means the current object should come after the specified object in a sorted order.
- Returns `0 (zero)` if the current object (`obj1`) is equal to the specified object (`obj2`).

**`public boolean equals(Object obj)`:**

## Demo Code

**Different implementation of `compare` method.**

```java
class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;

    /*
     * return I1.compareTo(I2);  // default natural sorting order [0, 5, 8, 9, 10]
     * return -I1.compareTo(I2);  // Descending [10, 9, 8, 5, 0]
     * return I1.compareTo(I2);  // Descending [10, 9, 8, 5, 0]
     * return -I1.compareTo(I2);  // Ascending [0, 5, 8, 9, 10]
     * return +1; // [Insertion Order] [10, 9, 9, 8, 5, 5, 0]
     * return -1; // [reverse of Insertion Order] [0, 5, 5, 8, 9, 9, 10]
     * return 0; // [Only first element will be inserted and all remaining will be considered as duplicated]
     */

        return I1 < I2 ? 1 : I1 > I2 ? -1 : 0;
    }
}
```
