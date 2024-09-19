package gun1;
import sc.MyScanner;
public class KendisiniBölenAsalSayilar  {
    public static boolean asalSayiMi(int a){

        for(int i=2; i<=a ;i++){
            if(a%i!=0){
                continue;
            }
            else if(a==i){
                return true;
            }
            else
                break;

        }
        return false;
    }
    public static void main(String[] args) {
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

        while(true){
            int x=MyScanner.intVerLa();
            kendisiniBolenAsalSayilar(x);
        }

    }

    private static int kendisineKadarKacAsalSayiVar(int asalSayi) {
        int count= 0;
        for (int i = 2; i <= asalSayi; i++) {
            if(asalSayiMi(i)) {
                count++;
            }
        }
        return count;
    }

    public static void kendisiniBolenAsalSayilar(int girilenSayi) {
        for (int i = 2; i <= girilenSayi; i++) {
            if (asalSayiMi(i)) {
                if(girilenSayi%i==0)
                    System.out.println(i);
            }


        }


    }

}