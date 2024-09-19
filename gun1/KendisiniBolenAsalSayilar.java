package gun1;

import sc.MyScanner;

import gun1.KendisiniBölenAsalSayilar;

import gun1.KendisiniBölenAsalSayilar;

public class KendisiniBolenAsalSayilar {

    int x= MyScanner.intVerLa();


    public static void main(String[] args) {

        KendisiniBolenAsalSayilar a= new KendisiniBolenAsalSayilar();
        KendisiniBölenAsalSayilar.asalSayiMi(a.x);


//        while(true){
//            KendisiniBölenAsalSayilar.kendisiniBolenAsalSayilar(a.x);
//        }
        boolean y =KendisiniBölenAsalSayilar.asalSayiMi(a.x);
        System.out.println(y);

    }

}
