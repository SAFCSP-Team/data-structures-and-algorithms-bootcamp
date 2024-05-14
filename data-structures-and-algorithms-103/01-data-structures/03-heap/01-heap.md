# Heap

### Concept 
`Heap` is a hierarchical data structure that can be implemented using various underlying structures, such as arrays or trees.  

The heap property ensures that the highest/lowest priority element is always at the root of the heap. However, there is **no specific order or relationship between nodes** at any level, so the **heap is not sorted**.

##### Types of Heaps:
There are two main types of heap:

`Max Heap` The value of each node is **less than or equal** to the value of the parent, and **the greatest value is at the root**.

`Min Heap` The value of each node is **greater than or equal** to the value of its parent, and **the smallest value is at the root**. 

##### Heap Operations
- `heapify`: Constructs a heap from an unordered array.
- `insert`: Inserts an element into the heap while Ensuring the heap property.
- `delete`: Removes an element from the heap while Ensuring the heap property.
- `peek (Find max/min)`: Retrieves the element with the highest/lowest priority without removing it.
- `Extract(Max/Min)`: Retrieves the element with the highest/lowest priority and removes it.

Heaps have various applications, like:
- Heap is used while implementing a **priority queue**.
- **Heapsort** is a sorting algorithm that uses a heap to sort the value in ascending or descending order.
- **Binary Heap** is used for pathfinding algorithms to Find the shortest path between two points in a graph.

### Implementation
We are going to implement a max-heap using an array. 
```java
 public class Heap {
    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity]; // Initial capacity of the heap
        size = 0;
    }

    public void insert(int value) {
        ensureCapacity();
        heap[size++] = value;
        heapify(size - 1);
    }

    public int delete() {
        if (isEmpty()) {
            return -1; // or any suitable value to indicate error
        }
        int root = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return root;
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // or any suitable value to indicate error
        }
        return heap[0];
    }

    public int extract() {
        int max = peek();
        if (max != -1) {
            delete();
        }
        return max;
    }

    private void heapify(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int largest = index;

        if (leftChild < size && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        if (rightChild < size && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void ensureCapacity() {
        if (size == heap.length) {
            int[] newHeap = new int[size * 2];
            System.arraycopy(heap, 0, newHeap, 0, size);
            heap = newHeap;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

```
```java
public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(5);

        // Insert elements into the heap
        heap.insert(10);
        heap.insert(5);
        heap.insert(15);
        heap.insert(20);
        heap.insert(8);

        // Print the heap
        System.out.println("Heap: ");
        while (!heap.isEmpty()) {
            System.out.print(heap.delete() + " ");
        }
        System.out.println();
    }
}
```

### Projects

|Project Title | Deadline |
|:-----------:|:-------------:|
|[Heap project](https://github.com/SAFCSP-Team/heap-project) | - | 
