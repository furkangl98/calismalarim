import java.util.Scanner;

public class SwitchCaseD1 {

    public static void main(String[] args) {
        System.out.println("in a number");
        Scanner nmbr = new Scanner(System.in);
        int month = nmbr.nextInt();

        switch(month){
            case 1: System.out.println("Ocak"); break;
            default:
                System.out.println("bunu bilmiyorum"); break;


        }
    }
}
