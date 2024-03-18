# Generics

For example, to hold only String type of object we can create `Generic` version of `ArrayList` object as follows

For example, to hold only String type of objects, we can create a Generic version of ArrayList object as follows:

`ArrayList<String> l = new ArrayList<String>();`

With this ArrayList, we can only add String type of objects. If we mistakenly try to add any other type, we will encounter a compile-time error.

```java
ArrayList<String> l = new ArrayList<String>();

l.add("Deepak");
l.add("Prakash");
l.add(3); // complie-time error
l.add("Shiva");
```

Hence, through Generics, we achieve type-safety.

At the time of retrieval, we do not require to perform type casting.

```java
ArrayList<String> l = new ArrayList<String>();
l.add("Deepak");

String name = l.get(0); // type-casting is not required
```

| `ArrayList l = new ArrayList()`      | `ArrayList<String> l = new ArrayList<String>()` |
| ------------------------------------ | ----------------------------------------------- |
| `Non Generic` version of `ArrayList` | It is `Generic` version of `ArrayList`          |
| Not Type-Safe                        | Type-Safe                                       |
| Type-Casting require                 | Type-Casting not required                       |
