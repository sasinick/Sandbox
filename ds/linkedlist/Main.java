package linkedlist;

public class Main{

    public static void main(String []a) {
        LinkedList list = new LinkedList();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        //list.addFirst(10);
        //list.addFirst(20);
        list.removeFirst();
        System.out.println(list.contains(3));
    }
}