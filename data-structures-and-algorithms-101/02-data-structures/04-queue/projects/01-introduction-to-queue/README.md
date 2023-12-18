# Queue

### Objective

In this project, we will cover the fundamentals of the queue.


### Problem

Create a queue class using an array-based approach.

### Implementation

Write the implementation of the queue class to store the invoice number.
1. Create a Queue class using an array-based approach that contains two methods: enQueue and display.
2. The `enQueue` method allows to add a new element.
3. The `display` method print all element in the queue.

> Run the main method to verify the implementation. 


````Java
public class QueueArray {
  /*add your code here*/
  public static void main(String[] args) {
        QueueArray queueArray = new QueueArray();

        queueArray.enQueue(100);
        queueArray.enQueue(101);
        queueArray.enQueue(102);
        queueArray.display();
    }
}
````

> * Once you complete this project, Create an issue with title "Completed [your-username]".
> * You can use either Queue Array or Queue Linked List, to complete this project.
> * Create an issue of your questions, If you face any trouble solving the project.
