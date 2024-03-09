# LinkedList

## Overview

- **Underlying data structure:** Doubly linked list
- **Duplicate objects:** Allowed
- **Insertion order:** Preserved
- **Heterogeneous objects:** Allowed
- **Null insertion:** Possible

## Key Characteristics

**Ideal for:**

- Frequent operations are insertion or removal in the middle

**Less suitable for:**

- Frequent operation is retrival

## Constructors

- **`LinkedList l = new LinkedList();`**
  - Creates an empty LinkedList.
- **`ArrayList l = new ArrayList(Collection c);`**
  - Creates an LinkedList containing the elements of the given collection.

## Linked class specific Methods

LinkedList provides additional methods compared to the standard Collection interface, specifically for manipulating elements at the beginning and end of the list. These methods are useful for implementing stacks and queues.

**Adding element:**

- `void addFirst(Object o)`: Adds an element at the beginning of the list.
- `void addLast(Object o)`: Adds an element at the end of the list.

**Retriving Element:**

- `Object getFirst()`: Returns the first element in the list.
- `Object getLast()`: Returns the last element in the list.

**Removing Element:**

- `Object removeFirst()`: Removes and returns the first element in the list.
- `Object removeLast()`: Removes and returns the last element in the list.

## :bulb: Important Notes

- **Serializable and Cloneable:** Collection classes implement `Serializable` and `Cloneable` for object transfer and duplication.
- **RandomAccess Interface:** LinkedList does not implements it, making random access slower.

## Demo Code

```java
class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Deepak");
        l.add(3);
        l.add(null);
        l.add("Deepak");    //[Deepak, 3, null, Deepak]

        l.set(0, "Learner");    //[Learner, 3, null, Deepak]
        l.add(0, "Happy");  // [Happy, Learner, 3, null, Deepak]
        l.removeLast()  // [Happy, Learner, 3, null]
        l.addFirst("Most"); // [Most, Happy, Learner, 3, null]

        System.out.println(l);  // [Most, Happy, Learner, 3, null]
    }
}
