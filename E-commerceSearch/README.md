# Exercise 2: E-commerce Platform Search Function

## Objective

The objective of this exercise is to implement and compare two searching algorithms—Linear Search and Binary Search—for an e-commerce platform. The goal is to understand their performance, time complexity, and suitability for searching products efficiently.

---

## 1. Understanding Asymptotic Notation

### What is Big O Notation?

Big O notation is a mathematical representation used to describe the performance or time complexity of an algorithm as the size of the input data (`n`) increases. It helps determine how efficiently an algorithm performs and predicts its scalability for large datasets.

Common time complexities include:

| Complexity | Meaning |
|------------|---------|
| O(1) | Constant Time |
| O(log n) | Logarithmic Time |
| O(n) | Linear Time |
| O(n²) | Quadratic Time |

---

### Search Operation Scenarios

#### Best Case
The desired product is found immediately on the first comparison.

- Linear Search: First element is the target.
- Binary Search: Middle element is the target.

Time Complexity:
- Linear Search: **O(1)**
- Binary Search: **O(1)**

---

#### Average Case
The desired product is located somewhere in the middle of the collection.

Time Complexity:
- Linear Search: **O(n)**
- Binary Search: **O(log n)**

---

#### Worst Case
The product is either the last element or is not present in the collection.

Time Complexity:
- Linear Search: **O(n)**
- Binary Search: **O(log n)**

---

## 4. Analysis

### Time Complexity Comparison

| Algorithm | Best Case | Average Case | Worst Case | Requires Sorted Data |
|-----------|-----------|--------------|------------|----------------------|
| Linear Search | O(1) | O(n) | O(n) | No |
| Binary Search | O(1) | O(log n) | O(log n) | Yes |

---

### Comparison

**Linear Search**
- Simple to implement.
- Works on both sorted and unsorted data.
- Searches each element one by one.
- Less efficient for large datasets.

**Binary Search**
- Much faster than Linear Search for large datasets.
- Requires the data to be sorted.
- Repeatedly divides the search space into halves, reducing the number of comparisons.

---

### Conclusion

For an e-commerce platform containing thousands or millions of products, **Binary Search** is the preferred algorithm because it provides significantly faster search performance with a time complexity of **O(log n)**. However, it requires the product data to be sorted before searching.

**Linear Search** is more suitable for small or unsorted datasets where maintaining sorted order is unnecessary.

Therefore, Binary Search offers better scalability and efficiency for modern e-commerce applications, while Linear Search remains useful for simpler or unsorted collections.
