/* v 0.1 @ 3/11/2019
   Dynamic Array Implementation
   Step 1: Initialize and Print Content
     a) Initialize: Use constructor to accept length and create
     b) Print: Initialize can allocate 100, but only insert two
               so, dont depend on created array length, use counter 
*/

public class Arrays {

    // array accepts integer only, why??
    // can we make this generic
    private int[] items;
    private int count;

    public Arrays (int length) {
        items = new int[length];
    }

    public void print () {
        for (int i=0; i <items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
