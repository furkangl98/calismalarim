package gun1;

import javax.swing.*;
import java.util.Scanner;

public class Deneme123 {

    public static void main (String[] args) {
        int bebekSayisi =0;
        int cocukSayisi=0;
        int ergenSayisi=0;
        int gencSayisi=0;
        int ortaYasSayisi=0;
        int yasliSayisi=0;

        Scanner sc = new Scanner(System.in);
        String input = sc.next();




        for (String s:input.split("-")) {

            int x= Integer.parseInt(s);

            if (x<0){
                System.out.println("düzgün yaş gir");
            } else if (x<=3) {
                System.out.println("bebek");
                bebekSayisi++;

            }
            else if (x<=13) {
                System.out.println("çocuk");
                cocukSayisi++;

            }
            else if (x<=20) {
                System.out.println("Ergen");
                ergenSayisi++;


            }else if (x<=30) {
                System.out.println("Genç");
                gencSayisi++;

            }else if (x<=50) {
                System.out.println("orta yaş");
                ortaYasSayisi++;

            }else if (x<=120) {
                System.out.println("Yaşlı");
                yasliSayisi++;

            }
            else if (x>120) {



            }

        }
        System.out.println("Bebek Sayısı:"+ bebekSayisi );
        System.out.println("Çocuk Sayısı:"+ cocukSayisi );
        System.out.println("Ergen Sayısı:"+ ergenSayisi );
        System.out.println("Genç  Sayısı:"+ gencSayisi );
        System.out.println("Orta  Sayısı:"+ ortaYasSayisi );
        System.out.println("Yaşlı Sayısı:"+ yasliSayisi );


    }







}