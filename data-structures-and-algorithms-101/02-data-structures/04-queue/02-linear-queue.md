# Linear Queue

## Concept
> We have covered and implemented the queue in the introduction.

A **linear queue**, also known as a **simple queue** is a type of `queue` data structure, where the elements are stored in a linear or sequential manner. The first element is called `head`, and the last element of the queue is called `tail`.

The primary operations of the queue are:

* **Enqueue**: The insertion of a node at the end of the queue, which is at the `rear`/`tail`.
* **Dequeue**: The deletion of a node occurs at the start of the queue, which is at the `head`/`front`.

![1702816143315](images/02-linear-queue/1702816143315.png)

## Example

> We can use either `Linked list` or `Array` to create a `queue` data structure.

### Primitive 

- In Java programming language:  

````Java
public class QueueArray {
    final int SIZE = 5;

    int items[] = new int[SIZE];

    int front, rear;

    QueueArray() {
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        if(rear == SIZE - 1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(int element) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        // if the queue is empty
        if(isEmpty()) {
            front = 0;
        }

        rear++;
        items[rear] = element;

    }

    public int deQueue() {
        int element;

        if(isEmpty()){
            System.out.println("Queue is empty");
            return (-1);
        }
        else {

            element = items[front];

            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    public void display() {
        int i;
        if(isEmpty()) {
            System.out.println("Queue is empty!");
        }
        else {
            for(i = front; i <= rear; i++)
                System.out.println("Item -> " + items[i] + "  ");
        }
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray();

        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);

        queueArray.display();

        queueArray.deQueue();

        queueArray.display();

    }
}

````

**Output:**

```
Item -> 1  
Item -> 2  
Item -> 3  
1 Deleted
Item -> 2  
Item -> 3  
```

- In C++ Programming language:

```C++
#include <iostream>

class QueueArray {
    static const int SIZE = 5;
    int items[SIZE];
    int front, rear;

public:
    QueueArray() {
        front = -1;
        rear = -1;
    }

    bool isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    bool isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    void enQueue(int element) {
        if (isFull()) {
            std::cout << "Queue is full" << std::endl;
            return;
        }
        // if the queue is empty
        if (front == -1) {
            front = 0;
        }

        rear++;
        items[rear] = element;
    }

    int deQueue() {
        int element;

        if (isEmpty()) {
            std::cout << "Queue is empty" << std::endl;
            return (-1);
        } else {
            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }

            std::cout << element << " Deleted" << std::endl;
            return (element);
        }
    }

    void display() {
        if (isEmpty()) {
            std::cout << "Queue is empty!" << std::endl;
        } else {
            for (int i = front; i <= rear; i++) {
                std::cout << "Item -> " << items[i] << std::endl;
            }
        }
    }
};

int main() {
    QueueArray queueArray;

    queueArray.enQueue(1);
    queueArray.enQueue(2);
    queueArray.enQueue(3);

    queueArray.display();

    queueArray.deQueue();

    queueArray.display();

    return 0;
}
```

**Output:**
```
Item -> 1
Item -> 2
Item -> 3
1 Deleted
Item -> 2
Item -> 3
```

### Non-primitive

- In Java programming language: 

````Java
class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUser() {
        return this.username + ", " + this.password;
    }
}

public class QueueArray {
    final int SIZE = 5;

    User items[] = new User[SIZE];

    int front, rear;

    QueueArray() {
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        if(front == 0 && rear == SIZE - 1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(User element) {
        if(isFull()) {
            System.out.println("QueueLinkedList.Queue is full");
            return;
        }
        // if the queue is empty
        if(front == -1) {
            front = 0;
        }

        rear++;
        items[rear] = element;

    }

    public User deQueue() {


        if(isEmpty()){
            System.out.println("QueueLinkedList.Queue is empty");
            return null;
        }
        else {

            User element = items[front];

            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    public void display() {
        int i;
        if(isEmpty()) {
            System.out.println("Queue is empty!");
        }
        else {
            for(i = front; i <= rear; i++)
                System.out.println("Item -> " + items[i].getUser() + " ");
        }
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray();

        queueArray.enQueue(new User("fahad12", "P@ssw0rd"));
        queueArray.enQueue(new User("sara97", "123456"));
        queueArray.enQueue(new User("devahmed", "secret"));

        queueArray.display();

        queueArray.deQueue();

        queueArray.display();

    }
}
````
**Output:**
```
Item -> fahad12, P@ssw0rd 
Item -> sara97, 123456 
Item -> devahmed, secret 
User@681a9515 Deleted
Item -> sara97, 123456 
Item -> devahmed, secret 
```


- In C++ Programming language:

```C++
#include <iostream>
#include <string>

class QueueArray {
    static const int SIZE = 5;
    std::string items[SIZE];
    int front, rear;

public:
    QueueArray() {
        front = -1;
        rear = -1;
    }

    bool isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    bool isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    void enQueue(std::string element) {
        if (isFull()) {
            std::cout << "Queue is full" << std::endl;
            return;
        }
        // if the queue is empty
        if (front == -1) {
            front = 0;
        }

        rear++;
        items[rear] = element;
    }

    std::string deQueue() {
        std::string element;

        if (isEmpty()) {
            std::cout << "Queue is empty" << std::endl;
            return "";
        } else {
            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }

            std::cout << element << " Deleted" << std::endl;
            return element;
        }
    }

    void display() {
        if (isEmpty()) {
            std::cout << "Queue is empty!" << std::endl;
        } else {
            for (int i = front; i <= rear; i++) {
                std::cout << "Item -> " << items[i] << std::endl;
            }
        }
    }
};

int main() {
    QueueArray queueArray;

    queueArray.enQueue("A");
    queueArray.enQueue("B");
    queueArray.enQueue("C");

    queueArray.display();

    queueArray.deQueue();

    queueArray.display();

    return 0;
}
```

**Output:**
```
Item -> A
Item -> B
Item -> C
A Deleted
Item -> B
Item -> C
```
