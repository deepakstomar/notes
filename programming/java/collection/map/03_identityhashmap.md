# IdentityHashMap Class

It is the child class of `Map`.

It is exactly same as `HashMap` (include contructors and methods). Except the following differences

1. In case of `HashMap`
   - `JVM` will use `.equals()` method to identify duplicate keys, which is meant for content comparision.
2. In case of `IdentityHashMap`
   - `JVM` will use `==` operator to identify duplicate keys, which is meant for **reference comparision** (address comparision).

## Demo Code

**`HashMap` code**

> I1 and I2 are duplicate keys, because `I1.equals(I2)` retun `true`.
>
> In this case output is `{129=Prakash}`.

```java
import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test {

    public static void main(String[] args) {
       HashMap m = new HashMap();

       Integer I1 = 129;
       Integer I2 = 129;

       m.put(I1, "Deepak");
       m.put(I2, "Prakash");

       System.out.println(m); // {129=Prakash}
    }
}
```

**`IdentityHashMap` Code**

> If we replace `HashMap` with `IdentityHashMap`, then I1 and I2 are not duplicate keys, because `I1 == I2` returns `false`.
>
> In this case output is `{129=Deepak, 129=Prakash}`

```java
import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test {

    public static void main(String[] args) {
       IdentityHashMap m = new IdentityHashMap();

       Integer I1 = 129;
       Integer I2 = 129;

       m.put(I1, "Deepak");
       m.put(I2, "Prakash");

       System.out.println(m); // {129=Deepak, 129=Prakash}
    }
}
```
