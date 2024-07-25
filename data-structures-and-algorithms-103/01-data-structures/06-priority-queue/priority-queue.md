# Priority Queue 
In emergency rooms, patients wait in line or queue, and they are treated based on **the highest priority**, and not the order in which they arrive. Well, we have a data structure **Priority Queue** which behaves the same as an emergency queue, the element with the highest/lowest value gets processed first.  

## Priority Queue 
A priority queue is a data structure that stores an element based on its value priority. Either the highest or lowest priority element is dequeued/processed first.

> Priority Queue elements are sorted based on the highest/lowest value.

## Implementations
There are several ways to implement a priority queue, and the most common ways are:
- Binary Heap(Sorted Heap)
- Sorted Linked List
- Balanced Binary Search Tree

Implement `Priority Queue` using `Sorted Linked List`

> In the following implementation, the lowest value will be dequeued first.

```java

public class PriorityQueue {

    // Node class to represent each element in the priority queue 
    private class Node {
        int value; // is the priority value
        Node next; 

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head = null;

    // Add an element and maintain the order of the elements in the priority queue
    public void add(int value) {
        Node newNode = new Node(value);
        
        if(head == null) {
            head = newNode;
            return;
        }
        // if the priority queue is empty or the new element has the highest priority
        if (head.value > value) {
            newNode.next = head;
            head = newNode;
        } else { // if the new element has lower priority than the head
            Node current = head;
            while (current.next != null && current.next.value < value) {
                current = current.next;
            }
            // finally add the new element
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Dequeue the element which are the front/head of the priority queue
    public int remove() {

        // if the priority queue is not empty
        if (head != null) {
            int value = head.value;
            head = head.next;
            return value;
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        System.out.println(pq.remove()); // 1
        System.out.println(pq.remove()); // 2
        System.out.println(pq.remove()); // 3
    }
}
```

**OUTPUUT**
```
1
2
3
```

Project Title | 
|:-----------:|
|[Priority Queue](https://github.com/SAFCSP-Team/priority-queue) |

