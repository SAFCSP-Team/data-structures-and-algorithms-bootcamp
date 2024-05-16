# Heap

### Concept 
`Heap` is a hierarchical data structure that can be implemented using various underlying structures, such as arrays or trees.  

The heap property ensures that the highest/lowest priority element is always at the root of the heap. However, there is **no specific order or relationship between nodes** at any level, so the **heap is not sorted**.

**Types of Heaps:**

There are two main types of heap

`Max Heap` The value of each node is **less than or equal** to the value of the parent, and **the greatest value is at the root**.

`Min Heap` The value of each node is **greater than or equal** to the value of its parent, and **the smallest value is at the root**. 

**Heap Operations:**
- `heapify`: Constructs a heap from an unordered array.
- `insert`: Inserts an element into the heap while Ensuring the heap property.
- `delete`: Removes an element from the heap while Ensuring the heap property.
- `peek (Find max/min)`: Retrieves the highest/lowest priority element without removing it.
- `Extract(Max/Min)`: Retrieves the highest/lowest priority element and removes.

Heaps have various applications, like:
- Heap is used while implementing a **priority queue**.
- **Heapsort** is a sorting algorithm that uses a heap to sort the value in ascending or descending order.
- **Binary Heap** is used for pathfinding algorithms to Find the shortest path between two points in a graph.

### Implementation
We are going to implement a `max-heap` class using an array. 
```java
public class MaxHeap {
    public int[] heap; // Array to store the heap elements.
    public int count; // The number of elements in the heap. 
  
    public MaxHeap(int capacity) {
        heap = new int[capacity];
        count = 0; // Initialize the count to -1 (empty heap).
    }
  
    public boolean isEmpty() {
        return count == 0; 
    }

    public void ensureCapacity() {
        if (count == heap.length) { // Check if the array is full.
           // Resizes the array with double the length of the current array.
            int[] newHeap = new int[heap.length * 2];
            System.arraycopy(heap, 0, newHeap, 0, count);
            heap = newHeap;
        }
    }
  
    public void insert(int value) {
        ensureCapacity(); // Ensures that the heap has enough capacity.
        heap[count++] = value; // Adds the new element at the current count index and increments it.  
        heapifyUp(count - 1); // Check the heap property. 
    }

    public void delete(int value) {
        if (isEmpty()) {
            System.out.println("the heap is empty ");
        }
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (heap[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("the element is not found ");
        }
        heap[index] = heap[--count];
        int[] newHeap = new int[heap.length -1];
        System.arraycopy(heap, 0, newHeap, 0, count);
        heap = newHeap;
        heapifyDown(index);
        System.out.println("Number " + value + " has been deleted");
        }

    public int peek() {
        if (isEmpty()) {
            return -1; 
        }
        return heap[0];
    }

    public int extract() {
        int max = peek();
        if (max != -1) {
            delete(heap[0]);
        }
        return max;
    }

    public void heapifyUp(int index) {
        int parent = (index - 1) / 2; // Calculates the index of the parent element.

        /* enters a loop that continues until the `index` reaches the root of the heap (index 0),
           or the element at the current `index` is not greater than its parent.*/

        while (index > 0 && heap[index] > heap[parent]) {
            swap(index, parent); // If the element is not the root and its value is greater than its parent's, swap them.
            index = parent;
            heapifyUp(index);
        }
    }

    public void heapifyDown(int index) {
        int leftChild = 2 * index + 1; // Calculates the index of the left Child element.
        int rightChild = 2 * index + 2; // Calculates the index of the right Child element.
        int largest = index; // Store the index of the largest element, initializing it as the current index.

        /* Checks if the leftchild index in the heap bounds, and the element in the leftchild index
         is larger than the element at the largest index.*/
        if (leftChild < count && heap[leftChild] > heap[largest]) {  
            largest = leftChild; 
        }
        // Perform a similar check for the right child index, updating largest if necessary.
        if (rightChild < count && heap[rightChild] > heap[largest]) { 
            largest = rightChild; 
        }

        // If the current index is not equal to the largest, that means the heap property is violated. Needs to swap them.
        if (largest != index) { 
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
} 
```
The main class  
```java
public class main {
    public static void main(String[] args) {
        MaxHeap heapNumbers = new MaxHeap(6);

        // Insert elements into the heap
        heapNumbers.insert(10);
        heapNumbers.insert(5);
        heapNumbers.insert(15);
        heapNumbers.insert(20);
        heapNumbers.insert(8);
        heapNumbers.insert(13);

        // Print the heap
        System.out.println("Heap: ");
        for (int element : heapNumbers.heap) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        System.out.println("Heap peek: "+ heapNumbers.peek()); 
            heapNumbers.extract(); 
        System.out.println("Heap peek: "+ heapNumbers.peek());
        
        heapNumbers.delete(10);
        
        System.out.println("Heap: ");
        for (int element : heapNumbers.heap) {
            System.out.print(element + " ");
        }
        
    }
}
```
Output
```
Heap: 
20 15 13 5 8 10 
Heap peek: 20
Number 20 has been deleted
Heap peek: 15
Number 10 has been deleted
Heap: 
15 8 13 5 
```

### Projects

|Project Title | Deadline |
|:-----------:|:-------------:|
|[Heap project](https://github.com/SAFCSP-Team/heap-project) | - | 
