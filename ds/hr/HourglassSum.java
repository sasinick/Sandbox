package hr;

//import hr.Console;
// get integers from console and initialize in a 2D Array
// Iterate to form a hourglass
// add the hourglass
// check if hourglass is greater than prevoius iteration
//

public class HourglassSum {

    private static int maxHourglass = -63;
    private static int[][] matrix;
    private static final int _MAX = 6;
    private static final int _OFFSET = 2;

    public static void main(String []a) {
        Console console = new Console();
        console.feedMatrix();
        matrix = console.getMatrix();
        
        for(int i = 0; i < _MAX - _OFFSET; i++) {
            for(int j = 0; j < _MAX - _OFFSET; j++) {
                getHourglassSum(i, j);
            }
        }
        System.out.println(maxHourglass);
    }

    public static void getHourglassSum (int i, int j) {
        int tmp = 0;
        for(int k = j; k <= j + _OFFSET; k++) {
            tmp += matrix[i][k];
            tmp += matrix[i+_OFFSET][k];
        }
        tmp += matrix[i + 1][j + 1];

        System.out.println(tmp);
        if(maxHourglass < tmp)
            maxHourglass = tmp;
    }
}