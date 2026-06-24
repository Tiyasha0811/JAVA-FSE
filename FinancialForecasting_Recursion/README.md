# Exercise 7: Financial Forecasting

## Objective

The objective of this exercise is to develop a financial forecasting tool using recursion to predict future values based on historical growth rates. The exercise also analyzes the efficiency of the recursive approach and discusses possible optimizations.

---

## 1. Understanding Recursive Algorithms

### What is Recursion?

Recursion is a programming technique in which a method calls itself repeatedly to solve a problem. Instead of solving the entire problem at once, recursion breaks it down into smaller subproblems until a simple condition, known as the **base case**, is reached.

A recursive function consists of two essential parts:

- **Base Case:** The condition that stops the recursion.
- **Recursive Case:** The part where the function calls itself with a smaller or simpler input.

Recursion is particularly useful for problems that can be naturally divided into smaller versions of the same problem, such as tree traversal, factorial calculation, Fibonacci numbers, and financial forecasting.

---

## 4. Analysis

### Time Complexity

The recursive financial forecasting algorithm performs one recursive call for each forecasting period.

- **Time Complexity:** **O(n)**
- **Space Complexity:** **O(n)**

where **n** is the number of forecasting periods.

The time complexity is linear because the function makes exactly one recursive call for each remaining period.

---

### Optimization

Although recursion provides a simple and readable solution, excessive recursive calls may increase memory usage due to the function call stack.

The recursive solution can be optimized by:

- Using an **iterative approach (loop)** to eliminate recursive function calls.
- Applying **memoization** when recursive calculations involve overlapping subproblems.
- Using **dynamic programming** for more complex forecasting models that repeatedly compute the same values.

These optimizations reduce unnecessary computation and improve performance, especially when forecasting over a large number of periods.

---

## Conclusion

Recursion provides an elegant solution for financial forecasting by repeatedly applying the same growth calculation until the desired forecasting period is reached. While it is easy to understand and implement, iterative methods or dynamic programming techniques are generally preferred for large datasets because they are more memory-efficient and avoid excessive recursive calls.
