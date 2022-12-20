package lr1;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        String[][] a = new String[10][10];
        int figure = 10;
        int i = 0;
        int j;
        int z;
        for (i = 1; i < figure; i++) {


            for (j = 0; j < figure; j++) {
                if (j < i) {
                    a[i][j] = "+";

                } else {
                    a[i][j] = "-";

                }


            }System.out.println(Arrays.toString(a[i]));

        }
    }
}




