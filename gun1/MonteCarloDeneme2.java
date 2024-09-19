package gun1;

import java.util.Scanner;

public class MonteCarloDeneme2 {

    public static double piBulma (int kullanıcıdanAlinanSayi){
        double a;
        int countIn=0;
        //int countOn=0;

        for(int i=0; i<kullanıcıdanAlinanSayi; i++) {
            double x = Math.random();
            double y = Math.random();
            a = Math.sqrt((x * x) + (y * y));

            if (a <= 1) {
                countIn++;
                // } else
                //  countOn++;
            }
        }
        double pi=4.0*((double)countIn/kullanıcıdanAlinanSayi);


        System.out.println(pi);
        return pi;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int z= scanner.nextInt();
        piBulma(z);



    }


}