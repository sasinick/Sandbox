
package linkedlist;

import java.util.NoSuchElementException;

/*
    two instances of node: first and last
    any new element coming in to be wrapped as a node and dump inside 

    while adding, if its the first element set the first and last to that node
    else (1) last.next = newly created node
*/


public class LinkedList {

    private Node first;
    private Node last;
    int size = 0;
    
    /*
    Capabilities to be created
        addFirst, addLast, deleteFirst
        deleteLast, contains, indexOf
    */

    // A) implementation detail, moving within
    private class Node {
        private int value;
        private Node next;                // (1) here is the hyped tagging ability

        // node should always have a value, 
        // enforcing using constructor   //  (2) programming way of life
        private Node(int value) {
            this.value = value;
        }
    }
    
    // B) any new element will go through a scanner machine
    //    to get tagged 
    public void addLast(int item) {
        Node node = new Node(item);
        
        // if this is the first node added
        if(isEmpty()) 
            first = last = node;
        else {
            last.next = node;            // (3) add this node after current last
            last = node;                // (4) and last should point to the added node
        }
        size++;
    }

    // C) the flexibility to add the objects at first place, renaissance
    public void addFirst(int item) {
        Node node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;          // (6) take new node's next and point to current
            first = node;               // also, override first to point to new node
        }
        size++;
    }

    // D) we dont have any index yet, but index is just an integer
    //    so ya, just initialize one and keep incrementing during iteration
    //    another current node pointer to jump the nodes from first to last  // (7) current node pointer
    public int indexOf(int item) {
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.value == item) 
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return (indexOf(item) != -1);  // (8) tricky business
    }

    public void removeFirst() {
        // [10 -> 20 -> 30]
        if (isEmpty())                // (9) Edge cases
            throw new NoSuchElementException();

        if (first == last) {          // (9) Edge cases
            first = last = null;
            size = 0;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    // E) reach the last-1 and delete the last  // (10) can doubly linked list solve this
    public void removeLast() {
        // [10 -> 20 -> 30]
        //   p     c            
        if (isEmpty())  throw new NoSuchElementException();
        if(first == last) {
            first = last = null;
            size = 0;
            return;
        }
        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
        size--;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while(current != null) {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while(current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public int size() {
        return size;
    }

    public void reverseList() {
        // [10 -> 20 -> 30]
        Node previous = first;
        Node current = previous.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public Node kthNodeFromLast(int k) {
        
        return null;
    }

    // (5) refactoring
    private boolean isEmpty() {
        return (first == null);
    }

}