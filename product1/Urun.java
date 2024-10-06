package gun1.product1;

import java.util.ArrayList;
import java.util.List;

public class Urun {
    int id;
    String name;
    double price;
    static List<Urun> urunler= new ArrayList<>() ;

    Urun(int id,String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;

        urunler.add(this);
        System.out.println("ürün id'si "+id+" olan "+name+" ismindeki ürününüz " + price + " fiyatıyla urunler listesine eklenmiştir ");
    }

    public static Urun bul(int id){
        for (Urun urun: Urun.urunler){
            if(id==urun.id){
                return urun;
            }
        }
        return null;
    }
    public static Urun sil(int id){
        Urun silmekIstedigimUrun=Urun.bul(id);
        if (silmekIstedigimUrun!=null){
            urunler.remove(silmekIstedigimUrun);
        }
        return silmekIstedigimUrun;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
