# Queue

## Concept

A `queue` is a **liner data structure**, it store data one after the other in an order, the first data comes, is the first data out. Queue inser data at the first which is `tail`or`rear end`this operation is called`enqueue`, and for the deleting it delete the first element which is `head`or`front end`this operation is called`dequeue`.

An example of the `queue` in real life is a coffe shop line, the first person in line is served first, in another way first in first out.

this terminology is called **FIFO** First In First Out.

Types of queue:

* Simple Queue: Liner Queue, delete from the front/head and insertion at the end/tail. However, this has the less operations then the others type. it has some issue,
* Circular Queue: if the queue is full, the end/tail will point to the front/head of the queue. the main purpose of this cirular is to solve the some issue that the `simple queue` has.
* Double Ended Queue (Deque): the deque can only add/delete an element from both side at the end of the queue and at the head of the queue.
* Priority Queue: the highest priority will deleted, if there's more than one element with the same priortity, the first element have added will be deleted.

attributes:

> * front/head
> * rear/tail
> * enqueue
> * dequeue

## Example

### Primitive

Java

````Java
// Queue Array
````

### Composite

````Java
queue.enQueue(50);
queue.display(); //10 20 30 40 50
queue.deQueue();
queue.display(); //20 30 40 50
````

## Projects

Create a coffe shop line where the each element has different order.

```Java
['black coffe', 'latte', 'mocca' 'espreso', 'americano']
```



