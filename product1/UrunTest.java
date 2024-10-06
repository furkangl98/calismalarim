package gun1.product1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UrunTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("eklemek istediğiniz dosyanın adını giriniz");
        String dosyaAdı=sc.nextLine();

        while(true){
            System.out.println("Ürün eklemek için 1'e basın, ürün aratmak için 2'ye ürün silmek için 3'e basın, ürünleri listelemek için 4'e basın, ürün dosyası eklemek için 5'e basın çıkmak için 0'a basın ");
            int anahtar=sc.nextInt();
            sc.nextLine();
            if(anahtar==1){
                System.out.println("ürün id'sini ismini ve fiyatını aşağıdaki formatta olduğu gibi girin");
                System.out.println("id;isim;fiyat");
                String input = sc.nextLine();

                String[] urunBilgileri=input.split(";");
                int id = Integer.parseInt(urunBilgileri[0].trim());
                if (Urun.bul(id)!=null){
                    System.out.println("Eklemek istediğiniz id'deki ürün zaten ekli");
                    continue;
                }
                String name = urunBilgileri[1].trim();
                double price = Double.parseDouble(urunBilgileri[2].trim());
                Urun urun = new Urun(id,name,price);
                String urunBilgisi = id + ";" + name + ";" + price + "\n";

                Files.write(Paths.get(dosyaAdı), urunBilgisi.getBytes(), StandardOpenOption.APPEND);
                System.out.println("Ürün dosyaya yazıldı: " + urun);

            }
            else if(anahtar==5){
                System.out.println("eklemek istediğiniz dosyanın adını giriniz");
                String yeniDosyaAdı=sc.nextLine();

                List<String> urunSatirlari = Files.readAllLines(Paths.get(yeniDosyaAdı));
                for (String satir: urunSatirlari){
                    String[] urunBilgileri=satir.split(";");
                    int id = Integer.parseInt(urunBilgileri[0].trim());
                    if (Urun.bul(id)!=null){
                        System.out.println("Eklemek istediğiniz id'deki ürün zaten ekli");
                        continue;
                    }
                    String name = urunBilgileri[1].trim();
                    double price = Double.parseDouble(urunBilgileri[2].trim());
                    Urun urun = new Urun(id,name,price);
                    String urunBilgisi = id + ";" + name + ";" + price + "\n";
                    Files.write(Paths.get(dosyaAdı), urunBilgisi.getBytes(), StandardOpenOption.APPEND);

                }

            }
            else if(anahtar==2){
                System.out.println("Aratmak istediğiniz ürünün id'sini giriniz");
                int arananId = sc.nextInt();
                List<String> urunSatirlari = Files.readAllLines(Paths.get(dosyaAdı));
                boolean bulundu = false;
                for (String satir : urunSatirlari) {
                    String[] urunBilgileri = satir.split(";");
                    int id = Integer.parseInt(urunBilgileri[0].trim());
                    if (id == arananId) {
                        System.out.println("Ürün bulundu: " + satir);
                        bulundu = true;
                        break;
                    }
                }
                if (!bulundu) {
                    System.out.println("Ürün bulunamadı.");
                }
            }
            else if(anahtar==3){
                System.out.println("silmek istediğiniz ürünün id'sini yazın");
                int silinecekId=sc.nextInt();
                List<String> urunSatirlari = Files.readAllLines(Paths.get(dosyaAdı));
                boolean bulundu = false;
                List<String> yeniUrunSatirlari = new ArrayList<>();


                for (String satir : urunSatirlari) {
                    String[] urunBilgileri = satir.split(";");
                    int id = Integer.parseInt(urunBilgileri[0].trim());
                    if (id == silinecekId) {
                        System.out.println("Ürün silindi: " + satir);
                        bulundu = true;
                        Urun.sil(silinecekId);
                        continue;
                    }
                    yeniUrunSatirlari.add(satir);
                }

                if (!bulundu) {
                    System.out.println("Aradığınız id'deki ürün dosyada bulunamadı.");
                } else {
                    // Yeni satırları dosyaya yaz
                    Files.write(Paths.get(dosyaAdı), yeniUrunSatirlari, StandardOpenOption.TRUNCATE_EXISTING);
                }

            }
            else if(anahtar==4){
                List<String> urunSatirlari = Files.readAllLines(Paths.get(dosyaAdı));

                System.out.println("Ürünler:");
                for (String satir : urunSatirlari) {
                    System.out.println(satir);
                }
            }
            else if (anahtar==0){
                break;
            }
        }

    }
}
