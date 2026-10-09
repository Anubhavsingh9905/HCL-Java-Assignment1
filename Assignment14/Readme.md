
# Assignment 4: String Operations in Java

## Objective
To understand String, StringBuffer and StringBuilder and demonstrate
commonly used Java String methods.

## Difference Between String, StringBuffer and StringBuilder

| Feature | String | StringBuffer | StringBuilder |
|---|---|---|---|
| Mutability | Immutable | Mutable | Mutable |
| Thread safety | Immutable object | Synchronized | Not synchronized |
| Performance for repeated changes | Can be inefficient | Generally slower than StringBuilder | Generally faster for single-threaded changes |
| Common use | Fixed text | Mutable text shared across threads | Mutable text in single-threaded code |

## Methods Demonstrated
- length()
- isEmpty()
- charAt()
- toString()
- equals()
- compareTo()
- contains()
- indexOf()
- lastIndexOf()
- startsWith()
- endsWith()
- matches()
- substring()
- toLowerCase()
- trim()
- replace()
- split()
- join()
- valueOf()

## Requirements
Java JDK 8 or later.

## How to Run

```bash
javac StringOperations.java
java StringOperations
```

## Concepts Used
- String handling
- StringBuffer and StringBuilder
- Regular expressions
- Arrays and methods

## Author
Anubhav Singh