# Deque

## Concept

**Deque** or **double ended queue** is type of `queue` data structures. The `deque` can insert and delete from both ends, at the start of the `queue` and at the end of the `queue`.

![1702996668122](images/04-dequeues/1702996668122.png)

> To implement a queue, you can use an `array` or a `linked list`.

Operations of the deque are:

> * addFirst: add an element at the begining of the queue

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
