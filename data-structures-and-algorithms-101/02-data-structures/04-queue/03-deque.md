# Deque

## Concept

**Deque** or **double-ended queue** is a type of `queue` data structure. The `deque` can insert and delete from both ends, at the start of the `queue` and at the end of the `queue`.

![1702996668122](images/04-dequeues/1702996668122.png)

> To implement a deque, you can use an `array` or a `linked list`.

Operations of the deque are:

> * addFirst: add an element at the beginning of the queue.
> * addLast: add an element at the end of the queue.
> * deleteFirst: remove the first element.
> * deleteLast: remove the last element.

## Example

### Primitive

##### **Java**

````Java
class DequeArray {
    int arr[];
    int front;
    int rear;
    int size;

    public DequeArray(int size) {
        arr = new int[size];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void addFront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        arr[front] = key;
    }

    void addRear(int key) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (rear == size - 1)
            rear = 0;

        else
            rear = rear + 1;

        arr[rear] = key;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }

    public static void main(String[] args) {

        DequeArray deque = new DequeArray(5);

        deque.addFront(7);
        deque.addFront(6);
        deque.addFront(5);

        deque.addRear(8);
        deque.addRear(9);

        System.out.println("Front: "+ deque.getFront());
        System.out.println("Rear: "+ deque.getRear());

    }
}

````

**OUTPUT**

```
Front: 5
Rear: 9
```

<hr>

**C++**

```cpp
#include <iostream>
using namespace std;

#define MAX 4

class DequeArray {
private:
    int arr[MAX];
    int front;
    int rear;
    int size;

public:
    DequeArray(int size) {
        front = -1;
        rear = 0;
        this->size = size;
    }

    bool isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    bool isEmpty() {
        return (front == -1);
    }

    void addFront(int key) {
        if (isFull()) {
            cout << "Overflow" << endl;
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        arr[front] = key;
    }

    void addRear(int key) {
        if (isFull()) {
            cout << " Overflow " << endl;
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (rear == size - 1)
            rear = 0;

        else
            rear = rear + 1;

        arr[rear] = key;
    }

    void deleteFront() {
        if (isEmpty()) {
            cout << "Queue Underflow\n" << endl;
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    void deleteRear() {
        if (isEmpty() || rear < 0) {
            cout << " Underflow" << endl;
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    int getFront() {
        if (isEmpty()) {
            cout << " Underflow" << endl;
            return -1;
        }
        return arr[front];
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            cout << " Underflow\n" << endl;
            return -1;
        }
        return arr[rear];
    }

  
};

int main() {
    DequeArray deque(4);

    deque.addFront(10);
    deque.addRear(15);
    deque.addFront(5);
    deque.addRear(20);

    cout << "Front: " << deque.getFront() << endl;
    cout << "Rear: " << deque.getRear() << endl;

    return 0;
}
```

**OUTPUT**

```
Front: 5
Rear: 20
```

<hr>

### Non-Primitive

**Java**

```Java
class DequeArray {
    Object arr[];
    int front;
    int rear;
    final int size = 5;

    public DequeArray() {
        arr = new Object[size];
        front = -1;
        rear = 0;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void addFront(Object key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        arr[front] = key;
    }

    void addRear(Object key) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1)
            rear = 0;

        else
            rear = rear + 1;

        arr[rear] = key;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    Object getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

    Object getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }
}
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {

        DequeArray queue = new DequeArray();

        queue.addFront(new Person("Fahad"));
        queue.addFront(new Person("Khaled"));
        queue.addRear(new Person("Majed"));
        queue.addRear(new Person("Faris"));

        queue.deleteFront();

        System.out.println(queue.front);
        System.out.println(queue.rear);

    }
}

```

**OUTPUT**
```
0
2
```

<hr>

**C++**

```cpp
#include <iostream>
#include <string>

template <typename T> class Deque {
private:
  struct Node {
    T data;
    Node *next;
    Node *prev;
  };

  Node *first;
  Node *last;

public:
  Deque() : first(nullptr), last(nullptr) {}

  ~Deque() {
    while (!isEmpty()) {
      popFront();
    }
  }

  bool isEmpty() const { return (first == nullptr); }

  void pushFront(const T &value) {
    Node *newNode = new Node;
    newNode->data = value;
    newNode->next = first;
    newNode->prev = nullptr;

    if (isEmpty()) {
      last = newNode;
    } else {
      first->prev = newNode;
    }

    first = newNode;
  }

  void pushBack(const T &value) {
    Node *newNode = new Node;
    newNode->data = value;
    newNode->next = nullptr;
    newNode->prev = last;

    if (isEmpty()) {
      first = newNode;
    } else {
      last->next = newNode;
    }

    last = newNode;
  }

  void popFront() {
    if (isEmpty()) {
      std::cout << "Deque is empty. Cannot pop from the front." << std::endl;
      return;
    }

    Node *temp = first;
    first = first->next;

    if (first == nullptr) {
      last = nullptr;
    } else {
      first->prev = nullptr;
    }

    delete temp;
  }

  void popBack() {
    if (isEmpty()) {
      std::cout << "Deque is empty. Cannot pop from the back." << std::endl;
      return;
    }

    Node *temp = last;
    last = last->prev;

    if (last == nullptr) {
      first = nullptr;
    } else {
      last->next = nullptr;
    }

    delete temp;
  }

  const T &front() const {
    if (isEmpty()) {
      std::cout << "Deque is empty. No front element." << std::endl;
      exit(1);
    }

    return first->data;
  }

  const T &back() const {
    if (isEmpty()) {
      std::cout << "Deque is empty. No back element." << std::endl;
      exit(1);
    }

    return last->data;
  }
};
class Person {
public:
  std::string name;
};
int main() {
  Deque<Person> deque;

  deque.pushFront(Person{"Fahad"});
  deque.pushFront(Person{"Majed"});
  deque.pushBack(Person{"Khaled"});
  deque.pushFront(Person{"Faris"});


  deque.popFront();
  deque.popBack();

  std::cout << deque.front().name << std::endl;
  std::cout << deque.back().name << std::endl;

  return 0;
}
```
**OUTPUT**
```
Majed
Fahad
```

## Projects


| Project ID   | Project Title     | Deadline |
| ------------ | ----------------- | -------- |
| DSAProject02 | [Deque](https://github.com/SAFCSP-Team/deque-project) |          |
