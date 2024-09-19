package gun1;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class KokBulma {

    public static void kokBulma(int a, int b, int c) {

        float delta = (float) b * b - 4 * a * c;

        if(delta>0)

        {
            System.out.println("Delta büyüktür 0 olduğu için 2 tane farklı kökü olacaktır.");
            double kok1 = (-b + Math.sqrt(delta)) / (2 * a);
            double kok2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(kok1);
            System.out.println(kok2);

        }
        else if(delta==0) //burada tek eşittir kullanmıştın atama yaptığının farkında değildin!

        {
            System.out.println("delta = 0 olduğu için iki tane kökümüz olacak ve ikisi de birbirine eşit olacak");
            float kok1 = -(float) b / (2 * a);
            float kok2 = -(float) b / (2 * a);

            System.out.println(kok1);
            System.out.println(kok2);
        }
        else

        {
            System.out.println("Kök yoktur");
        }

    }
    public static void main(String[] args) {
        System.out.println("ax^2+bx+c=0 Şeklindeki denkleminizin a b ve c verilerini sırasıyla girin");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        int aa= scanner1.nextInt();
        int bb = scanner2.nextInt();
        int cc = scanner3.nextInt();

        kokBulma(aa,bb,cc);






    }


}
