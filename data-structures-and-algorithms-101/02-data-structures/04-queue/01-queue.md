# Queue

An example of the `queue` in real life is a coffee shop line, the first person in line is served first, and no one can get served without getting in the line.
The `queue` data structure behaves the same as the coffee shop line. The queue is line the data in the queue line the first entered data gets processed first.
The image describes a real-life queue and logical data structure queue. 

![data-structures-and-algorithms - Queue](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/149315149/07accaea-7d94-4741-8ea9-f2898df09e35)


## Concept

A `queue` is a **liner data structure**, it stores data one after the other in order, we can use `Array` or `Linked List` to implement the queue. The first data comes, is the first data out, it's also called  **FIFO** First In First Out. Queue inserts data at the end which is `tail` or `rear end` this operation is called `enqueue`, and for the deleting, it deletes the first element which is `head` or `front end` this operation is called `dequeue`.


The Queue attributes are: 
> * front / head
> * rear / tail / end 
> * enqueue / push / insert
> * dequeue / pop / delete

Types of queue:

* [Simple Queue](): Liner Queue, delete from the front/head and insertion at the end/tail. However, this has the less operations then the others type. it has some issue,
* Circular Queue: if the queue is full, the end/tail will point to the front/head of the queue. the main purpose of this cirular is to solve the some issue that the `simple queue` has.
* Double Ended Queue (Deque): the deque can only add/delete an element from both side at the end of the queue and at the head of the queue.
* Priority Queue: the highest priority will deleted, if there's more than one element with the same priortity, the first element have added will be deleted.

## Example

### Primitive

Java

````Java
QueueArray queue = new QueueArray();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        queue.display(); // 1, 2, 3

        queue.deQueue(); // 1

        queue.display(); // 2, 3
````

Non-Prmitive

````Java
queue.enQueue(50);
queue.display(); //10 20 30 40 50
queue.deQueue();
queue.display(); //20 30 40 50
````

## Projects

| Id      | Title          | Deadline |
| ------- | -------------- | -------- |
| Queue01 | QueueSimple    |          |
| Queue02 | Circular Queue |          |
| Queue03 | Deque |          |
| Queue04 | Priority Queue |          |

Create a coffe shop line where the each element has different order.

```Java
['black coffe', 'latte', 'mocca' 'espreso', 'americano']
```

