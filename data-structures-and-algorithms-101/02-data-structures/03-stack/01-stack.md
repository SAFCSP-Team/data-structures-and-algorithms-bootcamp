# Stack
Imagine you have a stack of books on your desk. Each book is placed on top of the previous one. When you want to **add a new book** to the stack, you put it **on top**. And when you want to **remove a book**, you take the one **from the top**.

In computer programming, a stack is similar to this stack of books. It is a data structure that follows the same idea. Instead of books, we have a stack of data. We can add new data on top of the stack, and when we want to remove data, we take the one from the top.

## Concept
`Stack`: is a fundamental data structure that stores data in a specific order, where items can **only be added or removed from the top**.
- In a stack, the most recently added item is always at the top, and it is the first item to be removed. This behavior is known as **"last in, first out" (LIFO)**.
- A stack has associated the following operations:
  - top(): return the top element from the stack without removing it.
  - Pop(): remove the top element from the stack and return it.
  - Push(x): add element x to top of stack.
  - IsEmpty(): return true if the stack is empty.
  - size(): return the size of the stack.

<img width="910" alt="Stack" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/03-stack/Images/stack.png">

> Java provides a built-in generic class called [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) in the java.util package, which can hold elements of any type.


## Implementation
To implement a stack, you can use an [array](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/01-introduction-to-arrays.md) or a [linked list](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/02-linked-list/01-introduction-to-linked-list.md).Previously, we learned about the characteristics of each of them, and now let's explore how the application of commands can differ for it.

Both array-based and linked list-based implementations have their advantages and trade-offs. The choice between them depends on factors such as the expected size of the stack, memory requirements, and the specific needs of your application.

1. Implementing a stack class in java using an array:
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
2. Implementing a stack class in java using a linked list:
- Code: 
```java
class Stack {
    private Node top; // Reference to the top node of the stack

    public Stack() {
        top = null; // Initialize the stack with no elements
    }

    public void push(int value) {
        Node newNode = new Node(value); // Create a new node with the given value
        newNode.next = top; // Set the new node's next reference to the current top node
        top = newNode; // Update the top reference to the new node
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return;
        }
        top = top.next; // Move the top reference to the next node, effectively removing the top node
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a default value indicating an empty stack
        }
        return top.data; // Return the data stored in the top node
    }

    public boolean isEmpty() {
        return (top == null); // Check if the stack is empty
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count; // Return the number of elements in the stack
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

    System.out.println("The size of the stack: " + stack.size());
}
```
- Output: 
```
Top element: 40
Top element after popping: 30
The size of stack: 3
```

## Projects
Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|DSAProject01| [Stack](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/03-stack/projects/01-stack/READMDE.md) | - | 
