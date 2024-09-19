package gun1;

import java.util.Scanner;

public class KelimelerinArasınaYıldızKoyma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.next();
        String eklenenString= "";

        for (int i = 0; i < input.length(); i++) {
           char c= input.charAt(i);
           if(i<input.length()-1)
                eklenenString=eklenenString+c+"*";
           else
               eklenenString=eklenenString+c;

        }
        System.out.println(eklenenString);
    }
}
