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
   Step 3: Remove data (at index)
     a) Check if index is valid and not exceeds current bounds
     b) Removalw ill leave a void that needs to be filled by left shifting
     c) This will cause the void to be at the last, play the decrement trick
   Step 4: Searching (by index)
     a) If element exists, return the index, else return -1
     b) Run a for loop to search for element one-by-one. O(n)
   Step 5: 
     a) Return largest no. 
     b) Return common items with another array
     c) Reverse the contents
     d) Insert at index
*/

/* 
    Enhancement: this array accepts integer only, can make it generic
    Why moving away from Array:
    Lookup by value: O(n)
    Insert: O(n)
    Delete: O(n)
    When to use, when the number of elements to be inserted in known prior
*/


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

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i=index; i < count; i++)
            items[i] = items[i+1];
        count--;
    }

    public int indexOf(int item) {
        for(int i=0; i< count; i++)
            if(items[i] == item)
                return i;
        return -1;
    }

    public void print() {
        for (int i=0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
