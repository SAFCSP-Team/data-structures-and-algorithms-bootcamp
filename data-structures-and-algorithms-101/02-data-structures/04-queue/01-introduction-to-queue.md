# Queue

Have you ever been in a line? we usually form a line whenever we want to be served whether it's at a coffee shop, or a bank, when we form a line the serving process will be much easier and controllable. Each new customer who comes in will join the last of the line, and the first customer in the line will be served first, after a customer gets served, they leave the line.

We use the same concept in the data structure to organize the data in programs, it's called a `queue`, which has the same concept as what we described earlier.

> Queue is another word to describe a line.

## Concept

`Queue` is a **linear data structure**. `queue` are organized in a line/queue the first element in the queue is called`head`. The end of the element in the queue is called the `tail`. Every new element will be added at the end of the queue. The first element in the line will be processed first, once the element is processed it will be removed from the queue.

> Some resources refer to the first element in the queue as [head, front],
>
> and for the end of the element they refer to it as [rear, tail, end]

**Why we use a queue?**

To ensure that elements are processed in the order in which they were added, making it possible to manage tasks or requests in a systematic and predictable manner.

**Queue Operation**

These are the primary operations of the queue:

**Enqueue**: add an element at the end of the queue.

**Dequeue**: return the last element from the queue and remove it from the queue.

> Each programming language has different names for enqueue and dequeue, however the results are the same.
>
> * enqueue = push / addFirst / insert
> * dequeue = pop / removeLast /delete

**Types of queue:**

* **Linear Queue**: A linear `queue` is the most basic form of a `queue`, where elements are stored in a linear manner.
* **Circular Queue**: A circular `queue` overcomes the limitation of a linear queue where the tail and head can reach the end of the underlying array or linked list.
* **Deque (Double-Ended Queue)**: It allows insertion and removal of elements from both ends.
* **Priority Queue**: Elements with higher priority are dequeued before elements with lower priority. If elements with the same priority occur, they are served according to their order in the queue.

## Example

### Primitive

#### Java

````Java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new LinkedList();

        // Enqueue: add to the end of the queue.
        queue.add(10);
        queue.add(20);

        // Dequeue: return the first element of the queue, and remove it.
        System.out.println(queue.remove());

        // Peek: return the first element of the queue, but don't remove it.
        System.out.println(queue.peek());

    }
}
````

**OUTPUT**

````
10
20
````

#### C++

````cpp
#include <iostream>
#include <queue>

int main() {
  std::queue<int> myQueue;

  // Enqueue: add to the end of the queue.
  myQueue.push(10);
  myQueue.push(20);

  // Peek: return the first element of the queue, but don't remove it
  std::cout << myQueue.front() << std::endl;

  // Dequeue: return the first element of the queue, and remove it.
  myQueue.pop();


  // Peek: return the first element of the queue, but don't remove it
  std::cout << myQueue.front() << std::endl;

  return 0;
}
````

**OUTPUT**

````
10
20
````

### Non-Prmitive

#### Java

````Java
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.in;

class MyData {
    int id;

    MyData(int i) {
        id = i;
    }
}

public class Main {
    public static void main(String[] args) {

        Queue<MyData> queue = new LinkedList<>();

        // Enqueue: add to the end of the queue.
        queue.add(new MyData(10));
        queue.add(new MyData(20));

        // Dequeue: return the first element of the queue, and remove it.
        System.out.println(queue.remove().id);

        for (MyData data : queue) {
            System.out.println(data.id);
        }
    }
}
````

#### C++

````cpp

#include <iostream>
#include <queue>

class MyData {
public:
    int id;

    MyData(int i) : id(i) {}
};

int main() {
 std::queue<MyData> myQueue;

 // Enqueue: add to the end of the queue.
 myQueue.push(MyData(10));
 myQueue.push(MyData(20));

 // Peek: return the first element of the queue, but don't remove it
 std::cout << myQueue.front().id << std::endl;

 // Dequeue: return the first element of the queue, and remove it.
 myQueue.pop();

 // Peek: return the first element of the queue, but don't remove it
 std::cout << myQueue.front().id << std::endl;

 return 0;
}
````

## Projects


| Id      | Title           | Deadline |
| ------- | --------------- | -------- |
| Queue01 | Linear Queue    |          |
| Queue02 | Circular Queue |          |
| Queue03 | Deque           |          |
| Queue04 | Priority Queue  |          |
