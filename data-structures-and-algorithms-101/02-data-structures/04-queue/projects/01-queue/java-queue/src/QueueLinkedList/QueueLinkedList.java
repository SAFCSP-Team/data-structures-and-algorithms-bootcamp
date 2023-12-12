package QueueLinkedList;

public class QueueLinkedList {

    Node front;
    Node rear;

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int key) {

            Node temp = new Node(key);

            if(this.rear == null) {
                this.front = this.rear = temp;
                return;
            }

            this.rear.next = temp;
            this.rear = temp;
    }

    public void deQueue() {
        // if queue is empty, return NULL.
        if(this.front == null) {
            return;
        }

        Node temp = this.front;
        this.front = this.front.next;

        if(this.front == null) {
            this.rear = null;
        }
    }

    public void display() {
        if(this.front == null) {
            System.out.println("QueueLinkedList.Queue is empty");
            return;
        }
        System.out.println("Front: "+this.front.key);
        System.out.println("Rear: "+this.rear.key);

        Node temp = this.front;
        while(temp != null) {
            System.out.println(temp.key);
            temp = temp.next;
        }
    }

}
