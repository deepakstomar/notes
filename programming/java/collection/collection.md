# Collections

If we want to represent a group of individual object as a single entity than we should we go for collection.

- Collections are growable in nature that is based on our requirement, we can increase or decrease the size.
- Collections can hold bold homogeneous and heterogeneous objects.
- Every collection class is implemented based on some standard data structure. For every requirement ready made support is available.
- Being a programmer we are responsible to use those method and we are not responsible to implement those methods.

## Arrays

### Arrays drawbacks

- Fixed in size. Once array is created you can't change its size.
- Hold only **homogeneous** data type.
  - You can eliminate this drawback using create Object array.
- No underlining data structure.
  - If you want to sort array you have to write code for sorting.

## 9 interface of Collection Framework

1. Collection
2. List
3. Set
4. SortedSet
5. NavigableSet
6. Queue
7. Map
8. SortedMap
9. NavigableMap

### 1. Collection (I)

It is interface which contains common methods.

- If we want to represent a group of individual object as a single entity then we should go for Collection.
  -Collection Interface defines most common methods which are applicable for any collection object.
- In general Collection Interface is considered as root interface of Collection Framework.
- There is no concrete class which implements Collection Interface directly.

#### Collection vs Collections

Collection is an interface, if we want to represent a group of individual object as single entity then we should go for Collection.

Collections is an utility class present in `java.util` package to define several utility methods for Collection objects. Like sorting, searching.

### 2. List (I)

It is a child interface of Collection.

If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved, than we should go for List.

- **Collection(I)**
  - **List(I)**: 1.2v
    - _ArrayList_: 1.2v
    - _LinkedList_: 1.2v
    - **Vector**: 1.0v
      - _Stack_: 1.0v

:bulb: Note: In 1.2 version Vector and Stack classes are re-engineered to implement List interface.

### Set (I)

It is the child interface of Collection

If we want to represent a group of individual objects as single entity where duplicates are not allowed and insertion order not required, than we should go for Set.

- **Collection (I)**
  - **Set(I)**: 1.2v
    - _HashSet_: 1.2v
    - _LinkedHashSet_: 1.4v

### SortedSet (I)

It is the child interface of Set.

If we want to represent a group of individual objects as single entity where duplicates are not allowed and all object should be inserted to some sorting order.

- **Collection (I)**
  - **Set(I)**: 1.2v
    - **SortedSet**: 1.2v

### NavigableSet

It is the child interface of SortedSet.

It contains several methods for navigation perposes.

- **Collection (I)**
  - **Set(I)**: 1.2v
    - **SortedSet(I)**: 1.2v
      - **NavigableSet**: 1.6v
        - _TreeSet_: 1.2v

#### Difference between **List** and **Set**.

|           List            |              Set              |
| :-----------------------: | :---------------------------: |
|  Duplicates are allowed   |  Duplicates are not allowed   |
| Insertion order preserved | Insertion order not preserved |

### Queue

It is the child interface of Collection.

If we want to represent group of object **prior to processing** then we should go for **Queue**.

Usually **Queue** follows FIFO order but based on our requirement we can implement our own priority.

**Example:** Before sending a mail all email ids, we have to store in some data structure. In which order we added mail ids in the same order only mail should be delivered.

- **Collection (I)**
  - **Queue (I)**: 1.5v
    - _Priority Queue_: 1.5v
    - _Blocking Queue_: 1.5v
      - _PriorityBlockingQueue_: 1.5v
      - _LinkedBlockingQueue_: 1.5v
