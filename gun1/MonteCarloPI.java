package gun1;

import java.util.Scanner;

public class MonteCarloPI {
    public static void main(String[] args) {
        while (2 == 2) {
            piHesabı();
        }


    }

    private static void piHesabı() {
        System.out.println("bir sayi giriniz");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberInCircle = 0;
        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            double x = Math.random();
            double y = Math.random();
            double distance = x * x + y * y;
            if (distance <= 1)
                numberInCircle++;
        }
        long end = System.currentTimeMillis();
        long Time = end - start;
        double MyPI = 4.0 * numberInCircle / n;
        System.out.println("My Pi   :" + MyPI);
        System.out.println("Java's Pi   :" + Math.PI);
        System.out.println(Time);
    }
}
