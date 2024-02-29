# Big O Notation

## Rules of Big O Notation

- It's a **Single Processor**.
- It performs **Sequential Execution** of statements.
- Assignment operation takes 1 unit of time.
  - When unit can millisecond, second etc.
  - `int sum = 0;`
- Return statement takes 1 unit of time.
  - `return sum;`
- Arithmetical operation takes 1 unit of time.
  - `sum + 1;`
- Logical operation takes 1 unit of time.
  - `sum > 3;`
- Other small/single operations takes 1 unit of time.
- Drop lower order terms
  - `T = n^2 + 3n + 1 = O(n^2)`
- Drop constant multipliers
  - `T = 3n^2 + 6n + 1 = O(n^2)`

## Calculating Time Complexity of Constant Algorithm

```java
public int sum(int x, int y) {
  int result = x + y;
  return result;
}
```

- line no 2 we are accessing x and y, so two operation.
- line no 2 performing arithmetic operation, so one operation.
- line no 2 assigning to result variable, so one operation.
- line 3 accessing result variable, one operation.
- line 3 returning result variable, one operation.
- `T = 4 + 2 = 6`
- `T ≈ C (constant)`
- **Time Complexity = O(1)**

| Line no | Operation     | Unit Time |
| ------- | ------------- | --------- |
| 2       | 1 + 1 + 1 + 1 | 4         |
| 3       | 1 + 1         | 2         |
