# Comparision

Comparision between `HashSet`, `LinkedHashSet` and `TreeSet`.

| Property                  | HashSet        | LinkedHashSet          | TreeSet       |
| ------------------------- | -------------- | ---------------------- | ------------- |
| Underlying Data Structure | HashTable      | LinkedList + HashTable | BalanceTree   |
| Duplicates Objects        | Not Allowed    | Not Allowed            | Not Allowed   |
| Insertion Order           | Not Preserved  | Preserved              | Not Preserved |
| Sorting Order             | NA             | NA                     | Applicable    |
| Heterogeneous Objects     | Allowed        | Allowed                | Not Allowed   |
| null acceptance           | One null value | One null value         | Not allowed   |

> :bulb:**Null Acceptance:** Java 1.7 onward null is not allowed even as the first element.
