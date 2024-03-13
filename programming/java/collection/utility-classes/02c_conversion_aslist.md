# Array to List

`public static List asList(Object[] arr)`

Strictly speaking this method won't create an independent `List` object for the existing `Array`, we are getting **List View**.

```plain text
										  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
										 /									 \
										/									  \
		String [] s  ------------------>|									  |
										|		+++++++++++++++++++++++++	  |
										|		|	A	|	Z	|	B	|	  |
				just reference to Array	|		+++++++++++++++++++++++++	  |
		List l 	----------------------->|									  |
										\ 									  /
										 \_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _/
```

1. By using `Array` reference if we perform any change automatically that change will be reflected to the `List`. Similarly by using `List` reference if we perform any change that change will be reflected to the `Array`.
2. By using `List` reference we can't perform any operation, which change the size, otherwise we will get runtime exception saying `UnsupportedOperationException`.
    - `l.add("M")`: will throw exception.
    - `l.remove(1)`: will throw exception.
    - `l.set(1, "N")`: allowed because it is not changing size.
3. By using `List` reference we are not allowed to replace with Hetrogeneous object, otherwise we will get runtime exception saying `ArrayStoreException`.
    - `l.set(1, new Integer(10))`: will throw exception

## Demo Code

```java
import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {

    public static void main(String[] args) {
        String[] s = {"A", "Z", "B"};
        List l = Arrays.asList(s);
        System.out.println(l); // [A, Z, B]

        s[0] = "K";
        System.out.println(l); // [K, Z, B]

        l.set(1, "L");
        for(String s1 : s) {
            System.out.println(s1); // K, L, B
        }

        // l.add("Deepak"); // UnsupportedOperationException
        // l.remove(2); // UnsupportedOperationException
        // l.set(1, new Integer(10)); // ArrayStoreException
    }
}
```
