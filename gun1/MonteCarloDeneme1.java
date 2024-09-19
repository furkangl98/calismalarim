package gun1;

import java.util.Scanner;

public class MonteCarloDeneme1 {

    public static double piBulma (int kullanıcıdanAlinanSayi){
        double a;
        int countIn=0;
        //int countOn=0;

        for(int i=0; i<kullanıcıdanAlinanSayi; i++) {
            double x = Math.random();
            double y = Math.random();
            a = (x * x) + (y * y);
            if (a <= 1) {
                countIn++;
            }
        }
        double pi=4*((double)countIn/kullanıcıdanAlinanSayi);
        System.out.println(pi);
        return pi;
    }
    public static void main(String[] args) {
        piBulmayıCalistir();
    }

    private static void piBulmayıCalistir() {
        Scanner scanner = new Scanner(System.in);
        int z= scanner.nextInt();

        piBulma(z);
    }
}
