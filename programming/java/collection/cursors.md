# Cursors

If we want to get objects one by one from the collection, then we should go for cursor.

There 3 types of cursor:

1. **Enumeration Interface**
2. **Iterator Interface**
3. **List Iterator Interface**

## Enumeration (I)

We can use enumeration to get objects one by one from legecy collection object.

We can create enumeration object by using `elements()` method of Vector class `public Enumeration elements()`.

- `Enumeration e = v.elements()`
- Here `v` is Vector object.

**Enumeration Specific Methods:**

- `public boolean hasMoreElements()`
- `public Object hasNext()`

### Example Code of Enumeration

```java
class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }

        System.out.println(v);  // [0, 1, 2...10]

        Enumeration e = v.elements();

        while(e.hasMoreElements()) {
            Integer I = (Integer) e.naxtElement();
            if (I % 2 == 0) {
                System.out.println(I);  // [0, 2, 4, 6, 8, 10]
            }
        }
        System.out.print(v);    // [0, 1, 2...10]
    }
}
```

### Limitation of Enumeration

1. We can apply Enumeration concept only for legacy classes and it is not a universal cursor.
2. By using Enumeration we can get only read access and we can't perform remove operation.

## Iterator (I)

- We can apply Iterator concept for any `Collection` object. It is **universal cursor**
- By using Iterator we can perform both read and remove operaitons.

We can create Iterator object by using `iterator()` method of `Collection` interface `public Enumeration elements()`.

- `Iterator irt = c.elements()`
- Here `c` is any `Collection` object.

**Iterator Specific Methods:**

- `public boolean hasNext()`
- `public Object next()`
- `public void remove()`

### Example Code of Iterator

```java
import java.util.ArrayList;
import java.util.Iterator;

class Test {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }

        System.out.println(l); // [0, 1, 2...10]

        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            Integer I = (Integer) itr.next();
            if (I % 2 == 0) {
                System.out.println(I); // 0, 2, 4, 6, 8
            } else {
                itr.remove();
            }
        }

        System.out.println(l); // [0, 2, 4, 6, 8]
    }
}
```

### Limitation of Iterator

- By using `Enumeration` and `Iterator` we can always move only forward direction and we can't move backward direction. These are single direction cursor, but not bidirectional cursor.
- By using `Iterator` we can perform only **read** and **remove** operations and we can't perform replacement and addtion of new objects.

## List Iterator (I)

- By using `List Iterator` we can move both direction. It is **bidirectional** cursor.
- By using `List Iterator` we can perform **replacement** and **addition** of new objects in addition to read and remove operations.
- List Iterator is child interface of `Iterator`.

We can create `List Iterator` object by using `listIterator` of `List` interface.

- `ListIterator ltr = l.listIterator()`
- here 'l' is `List` Object.

**Iterator Specific Methods:**

- Forward operation
  - `public boolean hasNext()`
  - `public Object next()`
  - `public int nextIndex()`
- Backward operation
  - `public boolean hasPrevious()`
  - `public Object previous()`
  - `public int previousIndex()`
- Extra operation
  - `public void remove()`
  - `public void add(Object o)`
  - `public void set(Object o)`

### Example Code of List Iterator

```java
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Deepak");
        l.add("Prakash");
        l.add("Yogi");
        l.add("Maddy");
        System.out.println(l); // [Deepak, Prakash, Yogi, Maddy]

        ListIterator ltr = l.listIterator();
        while (ltr.hasNext()) {
            String s = (String) ltr.next();
            if (s.equals("Prakash")) {
                ltr.remove(); // [Deepak, Yogi, Maddy]
            } else if (s.equals("Maddy")) {
                ltr.add("Sandy"); // [Deepak, Yogi, Maddy, Sandy]
            } else if (s.equals("Yogi")) {
                ltr.set("Yogesh"); // [Deepak, Yogesh, Maddy, Sandy]
            }
        }

        System.out.println(l);
    }
}
```

| Property          | Enumeration                                       | Iterator                                           | ListIterator                              |
| ----------------- | ------------------------------------------------- | -------------------------------------------------- | ----------------------------------------- |
| Where can apply?  | Only for legacy classses                          | For any Collection object                          | Only for List object                      |
| Is it legacy      | Yes, Java 1.0                                     | No, Java 1.2                                       | No, Java 1.2                              |
| Movement          | Single direction (only forward direction)         | Single direction (only forward direction)          | Bidirectional                             |
| Allowed operation | Only read                                         | Read & Remove                                      | Read/Remove/Replace/Add                   |
| How to get?       | By using elements() of Vector class               | By using iterator() of Collection interface        | By using listIterator() of List interface |
| Methods           | 2 methods <br> hasMoreElement() <br> hasElement() | 3 methods <br> hasNext() <br> next() <br> remove() | 9 methods                                 |
