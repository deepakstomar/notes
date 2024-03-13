# Map Interface

`Map` is not a child interface of `Collection`.
If we want to represent group of object as **key-value** pairs, than we should go for `Map`

| Key | Value   |
| --- | ------- |
| 101 | Deepak  |
| 102 | Prakash |
| 103 | Yash    |
| 104 | Maddy   |

## Key characteristics

- Both `keys` and `values` are object only.
- Duplicated `keys` are not allowed but `values` can be duplicate.
- Each `key-value` pair called **entry**, hence `Map` is considered as collection of `entry` objects.

## Key Methods

1. `Object put(Object key, Object value)`

   - To add one `key-value` pair to the `Map`.
   - If the `key` is already present than old value will be replaced with new value and returns old value.

   ```java
   m.put(101, "Maddy"); // returns null
   m.put(102, "Prakash"); // returns null
   m.put(101, "Deepak"); // returns Maddy
   ```

2. `void putAll(Map m)`

   - Adds all key-value pairs from another Map to the current Map.

3. `Object get(Object key)`

   - Returns the value associated with the specified key. Returns null if the key is not found.

4. `Object remove(Object key)`

   - Removes the entry associated with the specified key and returns the old value. Returns null if the key is not found.

5. `boolean containsKey(Object key)`

   - Checks if the Map contains the specified key. Returns true if the key is found, false otherwise.

6. `boolean containsValue(Object value)`

   - Checks if the Map contains the specified value. Returns true if the value is found, false otherwise.

7. `boolean isEmpty()`

   - Checks if the Map is empty (contains no entries). Returns true if empty, false otherwise.

8. `int size()`

   - Returns the number of entries in the Map.

9. `void clear()`

   - Removes all entries from the Map.

### Collection views of Map

A Map provides several collection views that allow you to access its keys, values, and entries as separate collections.

1. `Set keySet()`

   - Returns a set containing all the keys in the Map.

2. `Collection values()`

   - Returns a collection containing all the values in the Map.

3. `Set entrySet()`

   - Returns a set containing all the key-value pairs (entries) in the Map.

## Entry Interface

Map is a group of `key-value` pairs and each `key-value` pair is called an `Entry`. Map is considered as collection of `Entry` objects. Without existing `Map` object their no chance of existing `Entry` Object. Hence `Entry` interface is defined inside `Map` interface.

```java
interface Map {
    interface Entry {
        Object getKey();
        Object getValue();
        Object setValue(Object newObject);
        /*
        * These are Entry specific methods
        * We can apply only on Entry objects
    }
}
```
