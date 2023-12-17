# Linear Queue

## Concept

**Linear Queue** is one of the linear data structure `queue` type,

insertion (Enqueue) takes place at end of the queue which is rear/tail, while the deletion occuers at the start of the queue which is front/head. As we discussed previews, queue is like a waiting line, each node is waiting for the head/front node to be process (Dequeue). Queue can do operation at the start of the queue and at the end of the queue.

**EnQueue**

The insertion of a node at the end of the queue, which is at the rear/tail.

**DeQueue**

The deletion of a node occuers at the start of the queue, which is at the head/front.

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


| Project ID   | Project Title     | Deadline |
| ------------ | ----------------- | -------- |
| DSAProject01 | [Linear Queue]() |          |
