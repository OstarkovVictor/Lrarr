package lr1;
import java.util.*;
public class ex8 {  public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите текст для шифрования: ");
            String value = in.nextLine();
            System.out.println("Введите ключ: ");

            int key = in.nextInt();

            String alfavit = "";

            char[] Chararr = value.toCharArray();
            int[] CharCode = new int[Chararr.length];

            for (int i = 0; i < Chararr.length; i++)
            {CharCode[i] = Chararr[i];CharCode[i] = CharCode[i] + key;}
            for (int i = 0; i < Chararr.length; i++)
            {Chararr[i] = (char) CharCode[i];}
            alfavit = new String(Chararr);

            System.out.print("Текст после преобразования :" + alfavit);
            System.out.print("Выполнить обратное преобразование? (y/n)");
            String y_n = "";
            while(true)
            {
                in = new Scanner(System.in);

                y_n = in.nextLine();
                if (y_n.contains("n")) { System.out.println("До свидания!");
                    break;
                }
                if (y_n.contains("y")) {
                   Chararr = alfavit.toCharArray();
                   CharCode = new int[Chararr.length];
                    for (int i = 0; i < Chararr.length; i++)

                    {CharCode[i] = Chararr[i];CharCode[i] = CharCode[i] - key;}

                    for (int i = 0; i < Chararr.length; i++)

                    {Chararr[i] = (char) CharCode[i];}

                    alfavit = new String(Chararr);
                    System.out.println(alfavit);
                    break;
                } else {
                    System.out.println("Введите корректный ответ: ");
                   break;
                }

            }
        }

    }