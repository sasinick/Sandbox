package arrays;

/*
    Starting on a journey
        1) Need a container to store and retrieve variables during my journey
        2) My container should be greedy and not let me die in between
        3) I will periodically clean my container
        4) My container is messy now
        5) I will call my container "Array"

            1) Store: insert function
               Retrieve: indexOf function
               RetriveAll: print function
            2) Dynamic growth
            3) Clean: delete function
            4) Sequential memory storage
            5) No comments
        
*/


public class Arrays2 {

    int[] items;
    int count;

    // what better way to initialize than constructor
    public Arrays2(int size) {
        items = new int[size];
    }

    // first order of business,
    // start filling up the container along the way
    public void insert(int item) {
        if (count >= items.length) {
            int[] newItems = new int[count * 2];  // (2) dynamic growth
            for(int i = 0; i< count;i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;            // (1) this one-liner
    }

    // my container should not be aware of console
    // but anyways, adding this functionality here for simplicity 
    public void print() {
        for(int i = 0; i <= items.length - 1; i++)
            System.out.println(items[i]);
    }

    // check if an item exists, prevents duplicates
    // if exists, return loop variable as index
    // else return -1
    public int indexOf(int item) {
        for (int i = 0; i < items.length -1 ;i++) {
            if(items[i] == item)         // crude??
                return i;
        }
        return -1;
    }

    // fill the deleted void 
    public void removeAt(int index) {
        if (index >= count)
            throw new IllegalStateException();
        for(int i = index; i <= count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

}