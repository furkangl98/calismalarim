package gun1;

import javax.swing.*;
import java.util.Scanner;

public class AsalSayiKontrolü2 {

    public static void asalSayiMi(int a){
        int count=2;

        for(int i=2; i<a ;i++){

            if(a%i!=0){
                count++;
                continue;

            }

            else {
                System.out.println("Asal sayı değildir");
                break;
            }



        }
        if (count==a)
            System.out.println("Asal Sayıdır");

    }







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int asalSayi = scanner.nextInt();

        asalSayiMi(asalSayi);
    }
}
