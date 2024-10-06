package gun1.KitapOkumaGelismis;

import java.time.LocalDate;
import java.util.Arrays;

public class Reader {
    String name;
    int gündeKacSayfaOkur;
    BookEnum[] okuyacagıKitaplar;

    Reader(String name,int gündeKacSayfaOkur,BookEnum[] okuyacagiKitaplar){
        this.name=name;
        this.gündeKacSayfaOkur=gündeKacSayfaOkur;
        this.okuyacagıKitaplar=okuyacagiKitaplar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", gündeKacSayfaOkur=" + gündeKacSayfaOkur +
                ", okuyacagıKitaplar=" + Arrays.toString(okuyacagıKitaplar) +
                '}';
    }

    public int getGündeKacSayfaOkur() {
        return gündeKacSayfaOkur;
    }

    public void setGündeKacSayfaOkur(int gündeKacSayfaOkur) {
        this.gündeKacSayfaOkur = gündeKacSayfaOkur;
    }

    public BookEnum[] getOkuyacagıKitaplar() {


        return okuyacagıKitaplar;
    }

    public void setOkuyacagıKitaplar(BookEnum[] okuyacagıKitaplar) {
        this.okuyacagıKitaplar = okuyacagıKitaplar;
    }
    public void kitaplarımıKacGundeBitiririm(){
        int toplamSayfaSayisi=0;
        LocalDate baslangicTarihi= LocalDate.now();
        for (BookEnum kitap: okuyacagıKitaplar){
            toplamSayfaSayisi+= kitap.totalPage;
        }

        int kacGündeBiter= toplamSayfaSayisi/gündeKacSayfaOkur;
        System.out.println("Her gün " + gündeKacSayfaOkur + " sayfa okursanız "+ kacGündeBiter+" günde kitaplarınız bitmiş olur ");
        System.out.println("Bu günden itibaren okumaya başlarsanız kitaplarınızın bitiriş tarihleri sırasıyla");
        for (BookEnum kitap:okuyacagıKitaplar){
            int kitapKacGundeBiter= kitap.totalPage/gündeKacSayfaOkur;
            LocalDate kitabıBitirisTarihi= baslangicTarihi.plusDays(kitapKacGundeBiter);
            System.out.println(kitap.title+" " + " bitiriş tarihiniz " +kitabıBitirisTarihi);
            baslangicTarihi=kitabıBitirisTarihi;
        }

    }

}
