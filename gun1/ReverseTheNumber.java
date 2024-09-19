package gun1;

import java.util.Scanner;

public class ReverseTheNumber {
    static int reverseTheNumber(int number) {
        String numberString = String.valueOf(number);
        //stringin son karakterini al sonra bu karakteri yeni bir stringe ata, karakteri bir azalt yeni stringin sonuna
        //stringin karakter sayısı 0 olana kadar buna devam et.

//        String reversedNumberString = "";
//        for (int i = 0; i < numberString.length(); i++) {
//            char iThCharacter = numberString.charAt(i);
//            reversedNumberString = iThCharacter + reversedNumberString;
//
//        }
//        return Integer.parseInt(reversedNumberString);
        String reversedString = reverseTheString(numberString);
        return Integer.parseInt(reversedString);
    }
    static String reverseTheString(String s) {

        //stringin son karakterini al sonra bu karakteri yeni bir stringe ata, karakteri bir azalt yeni stringin sonuna
        //stringin karakter sayısı 0 olana kadar buna devam et.

        String reversedString = "";
        for (int i = 0; i < s.length(); i++) {
            char iThCharacter = s.charAt(i);
            reversedString = iThCharacter + reversedString;

        }
        return reversedString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        int i = reverseTheNumber(sayi);
        System.out.println(i);
//        Scanner sc = new Scanner(System.in);
//        String sayi = sc.nextLine();
//        System.out.println(reverseTheString(sayi));


    }
}
