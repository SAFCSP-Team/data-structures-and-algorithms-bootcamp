# Priority Queue

An example of the `Priority Queue` is the hospital emergency queue, where the patient with higher risk is treated first.

It allocate the elements based on their priority value.

## Concept

`Priority Queue` is one of the`queue` type that arrange the elements based on their priority. Elements with higher priority values are typically retrieved before elements with lower priority values.

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
Queue<User> queue = new LinkedList<>();

        User user1 = new User("Khalid", 20);
        User user2 = new User("Faris", 25);
        User user3 = new User("Majed", 22);

        queue.enQueue(user1);
        queue.enQueue(user2);
        queue.enQueue(user3);

        queue.deQueue();

        queue.display(); // Faris, Majed
````

## Projects


| Id      | Title          | Deadline |
| ------- | -------------- | -------- |
| Queue01 | QueueSimple    |          |
| Queue02 | Circular Queue |          |
| Queue03 | Deque          |          |
| Queue04 | Priority Queue |          |

Create a coffe shop line where the each element has different order.

```Java
['black coffe', 'latte', 'mocca' 'espreso', 'americano']
```