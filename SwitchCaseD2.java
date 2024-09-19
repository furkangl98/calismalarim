import org.javaturk.oopj.ch05.decision.SwitchDemo;

import java.util.Scanner;

public class SwitchCaseD2 {
    public static void main(String[] args) {
        SwitchCaseD2 demo = new SwitchCaseD2();

        System.out.println("Ay giriniz");
        Scanner stdin = new Scanner(System.in);
        String month = stdin.next();

        demo.switchCaseD2(month);

    }

    public void switchCaseD2(String ay) {


        switch (ay) {
            case "Ocak" :  System.out.println("1");
            case "Şubat":  System.out.println("2");
            case "Aralık":  System.out.println("Kış"); break;
            case "Mart":  System.out.println("3");
            case "Nisan":  System.out.println("4");
            case "Mayıs":  System.out.println("İlkbahar"); break;
            case "Haziran":  System.out.println("5");
            case "Temmuz":  System.out.println("6");
            case "Ağustos":  System.out.println("Yaz"); break;
            case "Eylül": System.out.println("7");
            case "Ekim": System.out.println("8");
            case "Kasım": System.out.println("Sonbahar"); break;
            default: System.out.println("Ayı türkçe karakterlerle ilk harfi büyük olacak şekilde yazın"); break;
        }
    }
}
