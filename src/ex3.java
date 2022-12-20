package lr1;
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int figure = 10;
        int i = 0;
        int j;
        int z;
        for (i = 1; i < figure; i++) {


            for (j = 0; j < figure; j++) {
                if (j < i) {
                    a[i][j] = 0;

                } else {
                    a[i][j] = 2;

                }


                }System.out.println(Arrays.toString(a[i]));

        }
    }
}


