package gun1;
import sc.MyScanner;

public class BirTamSayiyaGeleneKadarOlanBolenler {
    static int x = MyScanner.intVerLa();

    public static void main(String[] args) {

        int count =0;
        for (int i = 2; i <=x ; i++) {
            if(x%i==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
