# Comparision

Comparision between `HashMap` and `Hashtable`.

| Feature         | ArrayList                                    | Vector                                        |
| --------------- | -------------------------------------------- | --------------------------------------------- |
| Synchronization | Non-synchronized methods                     | Synchronized methods                          |
| Thread Safety   | Not thread-safe (multiple thread can access) | Thread-safe (one thread can access at a time) |
| Performance     | Relatively high (no thread waiting)          | Relatively low (due to thread waiting)        |
| Null Insertion  | Allowed (both key and value)                 | Not Allowed (will get NullPointerException)   |
| Introduction    | Java 1.2                                     | Java 1.0 (legacy)                             |
