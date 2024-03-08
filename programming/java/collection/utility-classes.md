# Utility Classes

## 1. Collections

**Collections Utility Class:**

The `Collections` class is a static utility class that provides a variety of convenience methods for working with collections in Java. These methods are not part of the `Collection` interface itself but are accessible using `Collections`.

**Common methods provided by the `Collections` class:**

- **Sorting:**
  - `sort(List list)`: Sorts elements in a list according to their natural ordering or a custom comparator.
- **Searching:**
  - `binarySearch(List list, Object key)`: Performs a binary search for an element in a sorted list.
- **Transformations:**
  - `fill(List list, Object o)`: Fills all elements in a list with the specified value.
  - `copy(List dest, List src)`: Copies elements from one list to another.
- **Conversions:**
  - `emptyList()`: Returns an empty, unmodifiable list.
  - `singletonList(Object o)`: Returns a singleton list containing the specified element.
- **Checking:**
  - `isEmpty(Collection c)`: Checks if a collection is empty.
- **Unmodifiable collections:**
  - Provides methods to create unmodifiable versions of existing collections.

## 2. Arrays
