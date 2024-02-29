# Lambda Expression

## What is Lambda expression?
Lambda expression is anonymous function, which not having name, modifier and return type.

## Benefits of Lambda expression

- Enable function programming.
- Write more readable, maintainable and concise code.
- Allows easy and efficient use of APIs.
- Enable parallel processing.

### Example Lambda Expression
```java
() -> System.out.println("This is lambda expression.")
```

## Functional Interface implementation
### Example-01
 Without Lambda Expression
```java
// Without Lambda Expression
@FunctionalInterface
interface Show {
  public void display();
}

class ShowImpl implements Show {
  public void display() {
    System.out.println("Display method implementated.");
  }
}

class Main {
  public static void Main(String[] args) {
    Show show = new ShowImpl();
    show.display();
  }
}
```

With Lambda expression
```java
// With Lambda expression
@FunctionalInterface
interface Show {
  public void display();
}

class Main {
  public static void Main(String[] args) {
    Show show = () -> System.out.println("Display method implementated");
    show.display();
  }
}
```

### Example-02
Without Lambda Expression
```java
// Without Lambda Expression
@FunctionalInterface
interface Interf {
  public void add(int a, int b);
}

class Demo implements Interf {
  public void add(int a, int b) {
    System.out.println("Sum is: " + (a + b));
  }
}

class Main {
  public static void Main(String[] args) {
    Interf i = new Demo();
    i.add(10, 20);
    i.add(2, 4);
  }
}
```

With Lambda expression
```java
// With Lambda expression
@FunctionalInterface
interface Interf {
  public void add(int a, int b);
}

class Main {
  public static void Main(String[] args) {
    Interf i = (a, b) -> System.out.println("Sum is: " + (a + b));
    i.add(10, 20);
    i.add(2, 4);
  }
}
```
