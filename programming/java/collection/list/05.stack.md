# Stack Class

It is child class of `Vector`. It is a spcially designed class for **Last In First Out** (LIFO).

## Constructors

- **`Stack s = new Stac()`**
  - Creates an empty Stack.

## Stack Class Specific Methods

**Adding element:**

- `Object push(Object o)`: Insert an element into the stack.

**Retriving Element:**

- `Object peek()`: Returns the last (top) element of the stack.

**Removing Element:**

- `Object pop()`: Removes and returns the last (top) element of the stack.

**Other:**

- `boolan empty()`: Returns true, if stack is empty else false.
- `int search(Object o)`: Returns offset, if element is present else -1. Offset is counting from top to bottom and it start from 1.

## Demo Code

```java
class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.puch("a");
        s.puch("b");
        s.puch("c");
        System.out.println(s);  // [a, b, c]
        System.out.println(s.search(a));    // 3
        System.out.println(s.search(a));    // -1
    }
}
```
