package lr1;

import java.util.Arrays;
import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        int w = 3;
        int h = 5;
        int[][] a = new int[w][h];
        int[][] a1 = new int[h][w];
        int figure = 10;
        int i = 0;
        int j;
        int z = 0;
        Random random = new Random();

        for (i = 0; i < h; i++) {


            for (j = 0; j < w; j++) {
                a1[i][j] = random.nextInt(10);
                a[j][i] = a1[i][j];


            }


        }while ( z < 3){
            System.out.println(Arrays.toString(a[z]));
            z++;}z =0;

        while ( z < 5){
            System.out.println(Arrays.toString(a1[z]));
            z++;}
    }
}




