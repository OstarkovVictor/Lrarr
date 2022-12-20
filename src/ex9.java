package lr1;
import java.util.*;
public class ex9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); System.out.println("Введите текст");
        String value = in.nextLine();
        System.out.println("Введите ключ для шифрования");

        int i =0;int key = in.nextInt();
        String move ="";
        String move1 ="";

        String alfavit = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] alfavit1 = alfavit.toCharArray();
        if((alfavit.indexOf(value.charAt(i)))>(-1))
            {
                for(i = 0; i < value.length(); i++)
            {
                move = move+(alfavit.charAt(alfavit.indexOf(value.charAt(i)+key)));
            }
                System.out.println(move);
                System.out.print("преобразовать обратно? y n?");
                String y_n ="";
                while(!(y_n.contains("y")))
                {
                in = new Scanner(System.in);
                y_n = in.nextLine();
                    if (y_n.contains("n")) {
                        break;
                    }
                    if (y_n.contains("y")) {
                        break;
                    } System.out.print("преобразовать обратно? y n?");}
                if(y_n.contains("y")){for(i = 0; i < value.length(); i++)
                {move1 = move1+(alfavit.charAt(alfavit.indexOf(move.charAt(i)-key)));}}
                else {System.out.println("До свидания");}
                System.out.println(move1);}
        else {System.out.println("Неверная строка");}}}
