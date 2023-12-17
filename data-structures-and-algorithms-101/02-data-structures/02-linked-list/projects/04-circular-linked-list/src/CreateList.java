public class CreateList { 
        public static void main(String[] args) {  
        CreateList cl = new CreateList();  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        cl.display();
    }
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }
   public Node head = null;  
   public Node tail = null;  
     
 /* your code here */
}
