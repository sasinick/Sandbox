
package linkedlist;

/*
    Need a better container, searching is painfully slow, can cause death
    why not thread/wrap all stones inside the container
        threading is referencing
    this node class seems to be implementation detail, can be made inner class
    people want to call using LinkedList, they need not know about Node class
    
    Another way to look at this:
    every element in my container should have the ability to locate the next element
*/

// public class Node {
//     private int value;
//     private Node next;    // here is the hyped ability
// }