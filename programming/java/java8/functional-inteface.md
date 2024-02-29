# Functional Interface

Interface which contains only one **abstract method**, and it can contains any numbers of **default** and **static** methods.

It is also called as **Single Abstract Method** SAM interface.

`@FunctionalInterface` used to annotate interface as functional interface and it also help complier to validate interface as functional interface.

## Functional Interface w.r.t. Inheritance

**Case-1: (Valid case)** An interface extends Functional Interface and child interface does not contain any abstract method, then child interface is also Functional Interface.
```java
@FunctionalInterface
interface P {
  public void m1();
}

@FunctionalInterface
interface C extends P {
  // Does not contains any abstract method
}
```

**Case-2: (Valid case)** In the child interface, we can define exactly same abstract method as parent interface.
```java

@FunctionalInterface
interface P {
  public void m1();
}

@FunctionalInterface
interface C extends P {
  public void m1();   // defining same method as parent
}
```

**Case-3: (Invalid case)** In the child interface we can't define any new abstract methods otherwise we will get compile time error.
```java

@FunctionalInterface
interface P {
  public void m1();
}

@FunctionalInterface
interface C extends P {
  public void m2();
}
```
**Case-4: (Valid case)**
```java
@FunctionalInterface
interface P {
  public void m1();
}

// Child interface not annotated as FunctionalInterface
interface C extends P {
  public void m2();
}
```
