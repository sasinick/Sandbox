package stack;

import java.util.Arrays;
/*
    Uses of stack:
        Undo feature, compiler syntax checking
        evaluate expressions, forward/back navigation
    Functions: push, pop, peek, isempty. 
    Not meant for lookups/search operations
    All operations are  O(1)
*/

public class Stack {

    private int[] items;
    private int count;

    public Stack(int size) {
        if (size <= 0) 
            throw new IllegalArgumentException("Stack size should be greater than 0");
        this.items = new int[size];
    }

    public void push(int item) {
        if (count >= items.length)
            throw new StackOverflowError("Stack already full");
        items[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalArgumentException("Stack Empty");
        return items[--count];
    }

    @Override
    public String toString(){
        int [] copy = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(copy);
    }

    public int peek() {
        if (count == 0)
            throw new IllegalArgumentException("Stack Empty");
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }
}