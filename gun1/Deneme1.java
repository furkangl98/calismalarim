package gun1;

public class Deneme1 {
    //dik üçgen yapmaya çalışma yıldızlarla
    public static void main(String[] args) {
        int x=10;
        for (int kolon = 0; kolon < x; kolon++) {

            for (int satir = 0; satir < kolon+1; satir++) {
                System.out.print("*");

            }
            System.out.print("-");
            System.out.println(" ");

        }
    }
}
