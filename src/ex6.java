package lr1;

import java.util.Arrays;
import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        int w = 10;
        int h = 10;
        int[][] a = new int[w][h];
        int[][] a1 = new int[w - 1][h - 1];
        int i = 0;
        int j;
        int z = 0;
        int i1 = 0;
        int i_ = 0;
        int j1, j_ = 0;
        Random random = new Random();
        for (i = 0; i < w; i++) {


            for (j = 0; j < h; j++) {
                a[i][j] = random.nextInt(10);
            }
        }
        i1 = random.nextInt(w);
        j1 = random.nextInt(h);
        System.out.println(i1+1 + " строка " + (j1+1) +" столбец");

        for (i = 0; i < (w - 1); i++) {


            for (j = 0; j < (h - 1); j++) {
                if (i == i1) {i_ = 1;}
                if (j == 0) {j_ = 0;}
                if (j == j1) {j_ = 1;}



                    a1[i][j] = a[i + i_][j + j_];


                }


            }
            while (z < w) {
                System.out.println(Arrays.toString(a[z]));
                z++;
            }
            z = 0;
        System.out.println();
            while (z < w - 1) {
                System.out.println(Arrays.toString(a1[z]));
                z++;
            }
        }
    }







