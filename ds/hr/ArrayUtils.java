/* @ 18/11/2019
   not following Big-
   can also use a LIFO stack to implement same logic
   i suppose java collections has a stack implementation
*/

package hr;

public class ArrayUtils{

    public static void main(String [] a) {
        int[] array = {1, 2, 4, 8};
        int[] revArray = ArrayUtils.reverseOrder(array);
        printArray(revArray);
    }

    public static void printArray(int[] array) {
        for(int i=0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] reverseOrder(int[] array) {
        if (array.length == 0)
            throw new IllegalStateException();

        int[] reverseArray = new int[array.length];
        for(int i=0; i < array.length; i++) 
            reverseArray[i] = array[(array.length - 1) - i];

        return reverseArray;
    }
    
    /* 
    1) Assumptions:
            numbers and sum can be negative
            number range: -9 to +9.
            numbers to be summed in each hourglass=7
            minimum possible value 7x-9=-63 
    2) create a 2D array from input integers
    3) get/form hourglass (implementation detail)
    4) iterate the array for hourglass sum
        
    */ 
    public static int hourglassSum(int[] array) {


        return 0;
    }

}