public class ucgenDeneme2 {


    public static void main(String[] args) {
        int x=5;
        for (int kolon = 0; kolon < x; kolon++) {
            for (int satir = 0; satir <x+kolon; satir++) {
                if(satir<x-kolon-1)
                    System.out.print("-");
                else
                    System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
