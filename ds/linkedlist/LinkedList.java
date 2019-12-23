
package linkedlist;

/*
    two instances of node: first and last
    any new element coming in to be wrapped as a node and dump inside 

    while adding, if its the first element set the first and last to that node
    else (1) last.next = newly created node
*/


public class LinkedList {

    private Node first;
    private Node last;
    
    /*
    Capabilities to be created
        addFirst
        addLast
        deleteFirst
        deleteLast
        contains
        indexOf
    */

    // implementation detail, moving within
    private class Node {
        private int value;
        private Node next;                // (1) here is the hyped ability

        // node should always have a value, 
        // enforcing using constructor   //  (2) programming way of life
        private Node(int value) {
            this.value = value;
        }
    }
    
    // any new element will go through a scanner machine
    // to get tagged 
    public void addLast(int item) {
        Node node = new Node(item);
        
        // if this is the first node added
        if(first == null)
            first = last = node;
        else
            last.next = node;            // (3) add this node after last
            last = node;                // (4) and last should point to the added node

    }


    /*
    Need stack and queues to implement ArrayList??
    */
}