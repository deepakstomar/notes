# List Interface

The `List` interface is a child interface of `Collection`. It represents a group of objects as a single entity, allowing duplicates and preserving insertion order.

**Key characteristics:**

- **Duplicates:** Allowed
- **Insertion Order:** Preserved through indexing

**Key Methods:**

The `List` interface provides methods for adding, removing, updating, retrieving, and iterating over elements.

**Adding Elements:**

- `void add(int index, Object o)`: Adds a single element at the specified `index` to the collection.
- `boolean addAll(int index, Collection c)`: Adds all elements from another collection at the specified `index`.

**Removing Elements:**

- `Object remove(int index)`: Removes a single element at the specified `index` if present, otherwise returns `null`.

**Updating Elements:**

- `Object set(int index, Object o)`: Updates the value at the specified `index`.

**Retrieving Elements:**

- `Object get(int index)`: Returns the element at the specified `index`.

**Finding Elements:**

- `int indexOf(Object o)`: Returns the index of the first occurrence of the specified `object`.
- `int lastIndexOf(Object o)`: Returns the index of the last occurrence of the specified `object`.

**Iteration:**

- `ListIterator listIterator()`: Returns a list iterator for iterating over the elements in the list.
