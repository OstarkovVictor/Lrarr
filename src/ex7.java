package lr1;

import java.util.Arrays;
import java.util.Random;

public class ex7 {
    public static void main(String[] args) {
        int w = 10;
        int w_ = 0;
        int h = 10;
        int h_ = 0;
        int[][] a = new int[w][h];
        int[][] a1 = new int[h][w];
        int i = 0;
        int j;
        int z = 0;
        Random random = new Random();

        for (i = 0; i+h_ < h; i++) {

            for (j = 0; j < w; j++) {
                a1[i][j] = 1;
            }
                w -=1;w_ +=1;}
        w = 9;
        j = -1;
            while( (j < w) )
                {i = 10;j++;
                    while ( i > h) {i--;
                        System.out.println(i+""+j);
                    a1[i][j] = 2;
                    }h -=1;h_+=1;}


        while ( z < 10){
            System.out.println(Arrays.toString(a1[z]));
            z++;}


    }
}






