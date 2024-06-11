package edu.tiago.dataStructure.linkedlist;

public class LinkedList {

    private Node head;

    private Node tail;

    private int length;


    class Node {
        String data;

        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

}
