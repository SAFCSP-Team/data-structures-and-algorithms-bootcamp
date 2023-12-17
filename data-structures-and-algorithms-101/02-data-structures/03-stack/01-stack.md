# Stack
Imagine you have a stack of books on your desk. Each book is placed on top of the previous one. When you want to **add a new book** to the stack, you put it **on top**. And when you want to **remove a book**, you take the one **from the top**.

In computer programming, a stack is similar to this stack of books. It is a data structure that follows the same idea. Instead of books, we have a stack of data. We can add new data on top of the stack, and when we want to remove data, we take the one from the top.

## Concept
`Stack`: is a fundamental data structure that stores data in a specific order, where items can **only be added or removed from the top**.
- In a stack, the most recently added item is always at the top, and it is the first item to be removed. This behavior is known as **"last in, first out" (LIFO)**.
- To implement a stack, you can use an array or a linked list.
- A stack has associated the following operations:
  - top(): return the top element from the stack without removing it.
  - Pop(): remove the top element from the stack and return it.
  - Push(x): add element x to top of stack.
  - IsEmpty(): return true if the stack is empty.
  - size(): return the size of the stack.

<img width="910" alt="Stack" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/03-stack/Images/stack.png">

> Java provides a built-in generic class called [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) in the java.util package, which can hold elements of any type.

## Example 

#### 1. Implementing a stack class in java using an array:
- Code: 

```java
class Stack {
    private static final int MAX_SIZE = 10; // Maximum size of the stack
    private int[] data; // Array to store the stack elements
    private int top; // Index of the top element in the stack

    public Stack() {
        data = new int[MAX_SIZE];
        top = -1; // Initialize the top index to -1 (empty stack)
    }

    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
            return;
        }
        data[++top] = value; // Increment top and add the element to the stack
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return;
        }
        --top; // Decrement top to remove the top element (no need to delete or clear memory)
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1; // Return a default value indicating an empty stack
        }
        return data[top]; // Return the top element without removing it
    }

    public boolean isEmpty() {
        return (top == -1); // Check if the stack is empty
    }

    public int size() {
        return top + 1; // Return the number of elements in the stack
    }
}
```
- Using the class:
```java
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element: " + stack.top());

        stack.pop();
        System.out.println("Top element after popping: " + stack.top());

        System.out.println("The size of stack: " + stack.size());
    }
```
 - Output: 
```
Top element: 40
Top element after popping: 30
The size of stack: 3

```


#### 2. Implementing a stack class in C++ using an array:
- Code: 

```C++
#include <iostream>

const int MAX_SIZE = 10; // Maximum size of the stack

class Stack {
private:
    int data[MAX_SIZE]; // Array to store the stack elements
    int Top; // Index of the top element in the stack

public:
    Stack() {
        Top = -1; // Initialize the top index to -1 (empty stack)
    }

    void push(int value) {
        if (Top == MAX_SIZE - 1) {
            std::cout << "Stack Overflow: Cannot push element, stack is full." << std::endl;
            return;
        }
        data[++Top] = value; // Increment top and add the element to the stack
    }

    void pop() {
        if (Top == -1) {
            std::cout << "Stack Underflow: Cannot pop element, stack is empty." << std::endl;
            return;
        }
        --Top; // Decrement top to remove the top element (no need to delete or clear memory)
    }

    int top() {
        if (Top == -1) {
            std::cout << "Stack is empty." << std::endl;
            return -1; // Return a default value indicating an empty stack
        }
        return data[Top]; // Return the top element without removing it
    }

    bool isEmpty() {
        return (Top == -1); // Check if the stack is empty
    }
   int size() {
    return Top + 1; // Return the number of elements in the stack
}
};

```
- Using the class:
```C++
int main() {
    Stack stack;

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    std::cout << "Top element: " << stack.top() << std::endl;

    stack.pop();
    std::cout << "Top element after popping: " << stack.top() << std::endl;

std::cout << "The size of stack: " << stack.size() << std::endl;

    return 0;
}
```
 - Output: 
```
Top element: 40
Top element after popping: 30
The size of stack: 3
```

## Projects
|DSAProject01| [Stack](-) | - | 
