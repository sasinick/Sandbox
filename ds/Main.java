/* v 0.1 @ 3/11/2019
   DS Invoker
*/

public class Main {
    public static void main (String[] args) {
        Arrays intArray = new Arrays(3); 
        intArray.insert(1);
        intArray.insert(2);
        intArray.insert(3);
        intArray.insert(4);
        intArray.insert(5);
        intArray.removeAt(1);
        System.out.println("Index of 5 is: " + intArray.indexOf(5));
        intArray.print();
    }
}

/* 
   = ??
  *= All clean/local changes
  += added to staging
   >  after commit


 */
