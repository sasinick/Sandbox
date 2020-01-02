package hr;
import java.util.Scanner;

public class Console {
    private static final int _MAX = 6;
    private static final int _OFFSET = 2;
    //private static int matrix[][] = new int [_MAX][_MAX];
    private static int matrix[][] = {
                                        {-9, -9, -9, 1, 1, 1},
                                        {0, -9, 0, 4, 3, 2},
                                        {-9, -9, -9, 1, 2, 3},
                                        {0, 0, 8, 6, 6, 0},
                                        {0, 0, 0, -2, 0, 0},
                                        {0, 0, 1, 2, 4, 0}
                                    };
    
    private Scanner scan = new Scanner(System.in);

    public void feedMatrix () {
        for(int i = 0; i < _MAX; i++) {
            for(int j=0; j < _MAX; j++) {
                //matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }

    public int[][] getMatrix() {
        return matrix;
    }


}