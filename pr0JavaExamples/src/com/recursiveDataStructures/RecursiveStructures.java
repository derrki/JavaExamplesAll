package com.recursiveDataStructures;

public class RecursiveStructures {
    public static void main(String[] args) {
        Node tail;
        Node tailTwo;
        Node node0 = new Node(1, null);
        Node node1 = new Node(2, null);
        Node node2 = new Node(3, null);
        Node node3 = new Node(4, null);

        node3.next = node2;
        node2.next = node1;
        node1.next = node0;

        tail = node3;

        tailTwo = new Node(5, null);
        tailTwo = new Node(6, tailTwo);
        tailTwo = new Node(7, tailTwo);
        tailTwo = new Node(8, tailTwo);

    }
}
