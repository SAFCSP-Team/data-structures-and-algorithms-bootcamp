public class QueueArray {
    final int SIZE = 5;

    int items[] = new int[SIZE];

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

    public void enQueue(int element) {
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
        System.out.println("Insert "+ element);

    }

    public int deQueue() {
        int element;

        if(isEmpty()){
            System.out.println("QueueLinkedList.Queue is empty");
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
            System.out.println("Empty QueueLinkedList.Queue");
        }
        else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for(i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }



}
