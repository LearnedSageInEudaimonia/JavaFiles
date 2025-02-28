package LL;

public class Linkedlist<T> {
    Node head;
    private  int size;

    public Linkedlist() {
        this.size = 0;
    }

    class  Node<T>{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public  <T> void addFirst(T data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head= newNode;
    }

    public <T> void addLast(T data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList(){
        if(head == null ){
            System.out.println("Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
           currentNode= currentNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
           secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int  size(){
        return size;
    }



}
