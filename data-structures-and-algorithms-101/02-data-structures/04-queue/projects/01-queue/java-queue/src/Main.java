import java.util.Queue;
import QueueLinkedList.QueueLinkedList;

public class Main {
    public static void main(String[] args) {

        /**
            @QueueArray

        QueueArray queue = new QueueArray();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        queue.display();

        queue.deQueue();

        queue.display();
        */

        /**
            @QueueLinkedList
        */
        QueueLinkedList queue = new QueueLinkedList();

        queue.display();
        queue.enQueue(10);
        queue.enQueue(20);

        queue.display();
        queue.deQueue();
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.display();





    }
}