package lr1;

public class ex1 {
    public static void main(String[] args) {
        int figure = 11;
        int i = 0;
        int j;
        int z;
        for (i = 1; i < figure; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -12; j < figure; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}