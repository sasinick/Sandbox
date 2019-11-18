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
        int[] reverseArray = new int[array.length];

        if (array.length == 0)
            throw new IllegalStateException();
        
        // for(int i=array.length - 1; i >= 0; i--) {
        //     reverseArray[counter--] = array[i];
        //     System.out.println(reverseArray[i]);
        // }  
        
        for(int i=0; i < array.length; i++) {
            reverseArray[i] = array[(array.length - 1) - i];
            //System.out.println(reverseArray[i]);
        }

        return reverseArray;
    }
}