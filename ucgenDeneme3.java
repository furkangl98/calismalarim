public class ucgenDeneme3 {
    public static void main(String[] args) {
        int x = 10; // Üçgenin yüksekliği

        for (int kolon = 0; kolon < x; kolon++) {
            for (int satir = 0; satir < x + kolon; satir++) {
                // Eğer satır boşluk bölgesindeyse
                if (satir < x - kolon - 1) {
                    System.out.print(" ");
                }
                // Eğer satır yıldız bölgesindeyse
                else if (satir < x + kolon) {
                    System.out.print("*");
                }
            }
            // Bir satırı bitirip, alt satıra geçme
            System.out.println();
        }
    }
}
