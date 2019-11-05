/* v 0.1 @ 3/11/2019
   Dynamic Array Implementation
   Step 1: Initialize and Print Content
     a) Initialize: Use constructor to accept length and create
     b) Print: Initialize can allocate 100, but only insert two
               so, dont depend on created array length, use counter
   Step 2: Insert data
     a) Check if the array is full by comparing count to array length
         i) If full, then create a new array of twice the counter
         ii) Stuff items array into new array and add the new data (for loop)
     b) If array not full, just insert at end
*/

// Enhancement: this array accepts integer only, can make it generic

public class Arrays {
    
    private int[] items;
    private int count;

    public Arrays (int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            
            for (int i=0; i < count; i++) 
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void print() {
        System.out.println("HACKING: " + items[2]);
        for (int i=0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
