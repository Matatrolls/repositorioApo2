package ui;

import model.*;

public class Main {
    
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        

        Node node1 = new Node(0);

        list.addNode(node1);
        
        Node node2 = new Node(1);
        list.addNode(node2);
        System.out.println(list.getTail());

        Node node3 = new Node(2);
        list.addNode(node3);
        System.out.println(list.getTail());

        Node node4 = new Node(3);
        list.addNode(node4);
        System.out.println(list.getTail());

        System.out.println("**********************");
        System.out.println("add first");

        LinkedList list2= new LinkedList();

        
        list2.addNode(node2);
        System.out.println(list.getHead());

        
        list2.addNode(node2);
        System.out.println(list.getHead());

        
        list2.addNode(node3);
        System.out.println(list.getHead());

        
        list2.addNode(node4);
        System.out.println(list.getHead());
    }
}
