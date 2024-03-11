# SortedSet Interface

The `SortedSet` interface is child interface of `Set`. If we want to represent group of objects according to some sorting order without duplicates than we should go for `SortedSet`.

## SortedSet Interface specific Methods

- `Object first()`: Returns first element of the SortedSet.
- `Object last()`: Returns last element of the SortedSet.
- `SortedSet headSet(Object o)`: Returns SortedSet whose elements are less than `o`.
- `SortedSet tailSet(Object o)`: Returns SortedSet whose elements are greate than and equal to (>=) `o`.
- `SortedSet subSet(Object o1, Object o1)`: Returns SortedSet whose elements are greater than and equals to (>=) `o1` and less than (<) `o2`.
- `Comparator comparator()`: Returns Comparator object that describe underlying sorting technique. If we are using default natural sorting order then we will get `null`.

:bulb:**Note:**

Default natural sorting order

- Numbers: Ascending
- String: Alphabetic

## Example

```java
/*
* SortedSet = [100, 101, 104, 106, 110, 115, 120]
* first() --> 100
* last() --> 120
* headSet(106) --> [100, 101, 104]
* tailSet(106) --> [106, 110, 115, 120]
* subSet(101, 115) --> [101, 104, 106, 110]
*/
```
