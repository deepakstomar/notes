# Collection Interface

The `Collection` interface in Java represents a group of objects as a single unit. It defines a standard set of methods that any collection object should implement, regardless of its specific type (e.g., `List`, `Set`, `Queue`). This promotes consistency and simplifies working with various collections.

There is no concrete class which implements `Collection` interface directly.

**Key methods provided by the `Collection` interface:**

- **Adding elements:**
  - `boolean add(Object o)`: Adds a single element to the collection.
  - `boolean addAll(Collection c)`: Adds all elements from another collection.
- **Removing elements:**
  - `boolean remove(Object o)`: Removes a single element if present.
  - `boolean removeAll(Collection c)`: Removes all elements from another collection that are also present in this collection.
  - `void clear()`: Removes all elements from the collection.
  - `boolean retainAll(Collection c)`: Retains only the elements in this collection that are also present in another collection.
- **Checking membership:**
  - `boolean contains(Object o)`: Checks if the collection contains a specific element.
  - `boolean containsAll(Collection s)`: Checks if the collection contains all elements from another collection.
- **Size information:**
  - `int size()`: Returns the number of elements in the collection.
- **Iteration:**
  - Provides methods like `iterator()` and `forEach()` for iterating over elements.
  - `Iterator iterator()`:
- **Checking emptiness:**
  - `boolean isEmpty()`: Checks if the collection is empty.
- **Converting to array:**
  - `Object[] toArray()`: Returns an array containing all elements of the collection.
