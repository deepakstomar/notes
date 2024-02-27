# Data Structures & Algorithms

## Types of Data Structures

### Linear

- Array
- Linked List
- Stack
- Queue

### Non-Linear

- Tree
- Graph

## Algorithms

An Algorithm is a set of instructions to perform a task or to solve a given problem.

## Time Complexity

- Amount of time taken by algorithm to run.
- The input processed by an algorithm helps in determining the time complexity.

## Space Complexity

- Amount of memory or space taken by algorithm to run.
- The memory required to process the input by an algorithm helps in determining the space complexity.

## Asymptotic Analysis

- Asymptotic analysis helps in evaluating performance of an algorithm in terms of input size and its increase.
- Using asymptotic analysis we don't measure actual running time of algorithm.
- It helps in determining how time and space taken by algorithm increases with input size.

### Asymptotic Notations

Asymptotic Notations are the mathematical tools used to describe the running time of an algorithm in terms of input size. Asymptotic Notations helps us in determining:

  1. Best Case
  2. Average Case
  3. Worst Case

### Types of Asymptotic Notations

There are three notations for performing runtime analysis of an algorithm:

1. **Omega Notations**

   - It is the formal way to express the lower bound of an algorithm's running time.
   - Lower bound means for any given input this notation determines best amount of time an algorithm can take to complete.
   - For example: If we say certain algorithm takes 100 secs as best amount of time. So, 100 secs will be lower bound of that algorithm. The algorithm can take more than 100 secs but it will not take less than 100 secs.

2. **Big O Notations**

    - It is the formal way to express the upper bound of an algorithm's running time.
    - Upper bound means for any given input this notation determines longest amount of time an algorithm can take to complete.
    - For example: If we say certain algorithm takes 100 secs as longest amount of time. So, 100 secs will be upper bound of that algorithm. The algorithm can take less than 100 secs but it will not take more than 100 secs.

3. **Theta Notation**

    - It is the formal way to express both the upper and lower bound of an algorithm's running time.
    - By Lower and Upper bound means for any given input this notation determines average amount of item an algorithm can take to complete.
    - For example: If we run certain algorithm and it takes 100 secs for first run, 120 secs for second run, 110 for third run and so on. So, theta notations gives an average of running time of that algorithm.
