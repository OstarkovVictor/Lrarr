package lr1;

public class ex2 {
    public static void main(String[] args) {
        int figure = 10;
        int i = 0;
        int j;
        int z;
        for (i = 1; i < figure; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -5; j < figure; j++) {
                if (j > i) {
                    System.out.print("+");
                    z = z + 1;
                } else {
                    System.out.print("-");
                    z = z + 1;
                }


            }System.out.println(" Количество символов в строке " + z);

        }
    }
}
