package linkedlist;
import java.util.Arrays;


public class Main{

    public static void main(String []a) {
        LinkedList list = new LinkedList();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        //list.addFirst(10);
        //list.addFirst(20);
        //list.removeLast();
        //list.removeLast();
        list.reverseList();
        System.out.println("Size: " + list.size());
        System.out.println(list.contains(3));
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}