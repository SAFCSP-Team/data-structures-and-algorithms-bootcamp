# Dequeues

## Concept

**Dequeues** or **double ended queue** is type of queue liner data structures. This type can do insertion from the both sides, at the start of the `queue` `addFirst` and at the end of the `queue` `addLast`, and the deletion at the both side, at the start `removeFirst` at at the end of the queue `removeLast`.

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

#### Primitive

**Java**

````Java
Dequeues queue = deque Dequeues();
        deque.add(20);
        deque.add(30);
        deque.addFirst(10);
        deque.addLast(40);
        queue.display(); // 10, 20, 30, 40
````

#### Non-Prmitive

**Java**

````Java
Dequeues<User> deque = new LinkedList<>();

        User user1 = new User("Khalid", 20);
        User user2 = new User("Faris", 25);
        User user3 = new User("Majed", 22);

        deque.add(user1);
        deque.addLast(user2);
        deque.addFirst(user3);
        queue.display(); // Majed, Khalid, Faris
````

## Projects

1. Create an object called deque from `Dequeues` class
2. insert the following `String` values

> ```
> ["Abdullah", "Ahmed", "Majed"]
> ```

3. Insert String value at the end of the list with value of `['Mohammed']`
4. Insert String value at the start of the list with value of `['Naif ']`
5. Display the values of the dequeue

> The output should be
>
> ```
> ["Naif", "Abdullah", "Ahmed", "Majed", "Mohammed"]
> ```
