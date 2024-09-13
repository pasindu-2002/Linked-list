public class LinkedList {
    Node head;

    public LinkedList(){
        head = null;
    }

    public void insert(int data){

        Node n= new Node(data);

        if(head == null){
            head = n;
        }
        else {
            Node temp = head;
            while (temp.nextNode != null){
                temp = temp.nextNode;
            }
            temp.nextNode = n;
        }
        System.out.println(n.data +" was Insert Successfully");
    }

    public void addFront(int data){

        Node n= new Node(data);
        if(head == null){
            head = n;
        }
        else {
            Node temp = head;
            head = n;
            n.nextNode = temp;
        }
        System.out.println(n.data +" was Insert Successfully");
    }

    public void remove(){
       if(head == null){
           // Check Empty Linked List
           System.out.println("Linked List is Empty");
           return;
       }

       if(head.nextNode == null){
           // When Linked List is having only one node
           head = null;
       }
       else {
           // When Linked List is having more one node
           Node temp = head;

           while (temp.nextNode.nextNode != null){
               temp = temp.nextNode;
           }
           temp.nextNode = null;
       }
        System.out.println("Successfully removed");
    }

    public void removeFront(){
        if(head == null){
            // Check Empty Linked List
            System.out.println("Linked List is Empty");
            return;
        }

        if(head.nextNode == null){
            // When Linked List is having only one node
            head = null;
        }
        else {
            head = head.nextNode;
        }
        System.out.println("Successfully removed at front");

    }
    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }

    public void count(){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.nextNode;
        }
        System.out.println(count);
    }

}
