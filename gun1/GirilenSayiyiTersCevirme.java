package gun1;

import java.util.Scanner;

public class GirilenSayiyiTersCevirme {

    public static void sayiyiTerscevirme(int sayi){

        while(sayi>0){

            System.out.print(sayi%10);
            sayi/=10;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        sayiyiTerscevirme(a);

        String x = "Java";
    }


}
