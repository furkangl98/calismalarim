package gun1.KitapOkumaGelismis;


import java.util.Scanner;

public class ReaderTest {
    public static void main(String[] args) {
        System.out.println("İsminizi girin");
        Scanner sc=new Scanner(System.in);
        String kullanıcıdanAldıgımızIsım=sc.next();
        System.out.println("Günde kaç sayfa okumayı düşünüyorsunuz 50-100-150 olmak üzere üçünden birini yazın");
        int kullanıcıdanAlınanOkumaBilgisi= sc.nextInt();
        System.out.println("kaç kitap okumak istiyorsunuz?");
        int kitapSayisi=sc.nextInt();
        BookEnum[] okuyacagiKitaplar= new BookEnum[kitapSayisi];
        System.out.println("Hangi kitapları okumak istiyorsunuz? BOOK1 ,BOOK2 ,BOOK3,BOOK4,BOOK5 yazınız");
        for (int i = 0; i < kitapSayisi; i++) {
            String kitapSecimi= sc.next();
            okuyacagiKitaplar[i]=BookEnum.valueOf(kitapSecimi);

        }





        Reader reader1= new Reader(kullanıcıdanAldıgımızIsım,kullanıcıdanAlınanOkumaBilgisi,okuyacagiKitaplar);

        System.out.println(reader1);
        reader1.kitaplarımıKacGundeBitiririm();

    }
}
