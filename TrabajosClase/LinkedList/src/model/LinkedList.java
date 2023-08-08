package model;


public class LinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public LinkedList(){

    }

    public void addNode(Node node){

        //default case
        //empty list
        if(this.head == null && this.tail == null){
            this.head = node;
            this.tail = node;
        }
        //recursive case -> add at the end of the list
        else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public Node getTail(){
        return tail;
    }

    public void addFirst(Node node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            node.setNext(node);
            this.head = node;
        }
    }
}