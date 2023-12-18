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
