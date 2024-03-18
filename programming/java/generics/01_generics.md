# Generics

The main objectives of `Generics` are to provide **Type-Safety** and to resolve **Type-Casting** problems.

## Outline

1. Introduction
2. Generic Clauses
3. Bounded Types
4. Generic methods and wild-card character(?)
5. Communication with non Generic code
6. Conculsion

## Type-Safety

### Array

`Arrays` are type-safe, meaning we can guarantee the type of elements present inside an array.

For example, if our programming requirement is to hold only `String` type objects, we can choose a `String` `Array`. If we mistakenly try to add any other type of object, we will get a compile-time error.

```java
String[] s = new String[100];
s[0] = "Deepak";
s[1] = "Prakash";
s[2] = 2; // complie time error
/*
* Incompatible types
* found: java.lang.Integer
* required: java.lang.String
*/
```

Thus, a String Array can only contain string type objects, ensuring the type of elements present inside the array. Therefore, arrays are safe to use with respect to type; that is, arrays are type-safe.

### Collection

However, Collections are not type-safe. We cannot guarantee the type of elements present inside a Collection.

For example, if our programming requirement is to hold only String type objects and we choose an ArrayList and  attempting to add any other type of object won't result in a compile-time error, but the program may fail at runtime.

```java
ArrayList l = new ArrayList();
l.add("Deepak");
l.add("Prakash");
l.add(3);

String name1 = (String) l.get(0);
String name2 = (String) l.get(1);
String name3 = (String) l.get(2); // ClassCastException
```

Hence, we can't guarantee the type of elements inside collections. Due to this, Collections are not safe to use with respect to type; that is, Collections are not type-safe.

## Type Casting

In the case of Arrays, at the time of retrieval, it is not required to perform type-casting because there is a guarantee for the type of element present inside the Array.

```java
String[] a = new String[100];
s[0] = "Deepak";

String name = s[0]; // type casting not require
```

But in the case of Collections, at the time of retrieval, we must perform type-casting. This is because there is no guarantee for the type of element present inside the Collection.

```java
ArrayList l = new ArrayList();
l.add("Deepak");

String name = l.get(0); // compile-time error
/*
* incompatible type
* found: java.lang.Object
* required: java.lang.String
*/
String name = (String) l.get(0); // type-casting is mandatory
```

Hence, type-casting presents a significant challenge in Collections.
