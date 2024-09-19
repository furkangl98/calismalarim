package gun1;

import sc.MyScanner;
public class AsalSayiKontrolü {
    public static boolean asalSayiMi(int a){

        for(int i=2; i<=a ;i++){
           if(a%i!=0){
               continue;
           }
           else if(a==i)
               return true;
           else{
               return false;
           }
        }
        return false;
    }
    public static void main(String[] args) {

        int x =97;
        System.out.println(asalSayiMi(x));
//        while (true) {
//
//            int asalSayi=MyScanner.intVerLa();
//
//            boolean a =asalSayiMi(asalSayi);
//            if(a) {
//                System.out.println("Asal Sayıdır");
//            }
//            else {
//                System.out.println("Asal Sayı değildir");
//            }
//
//            System.out.println(kendisineKadarKacAsalSayiVar(asalSayi));
//        }

    }

    public static int kendisineKadarKacAsalSayiVar(int asalSayi) {
        int count= 0;
        for (int i = 2; i <= asalSayi; i++) {
            if(asalSayiMi(i)) {
                count++;
            }
        }
        return count;
    }

}
