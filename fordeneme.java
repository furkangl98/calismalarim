public class fordeneme {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        kareCiz(x, y);
        kareCiz(4,6);
        kareCiz(9,12);

    }

    private static void kareCiz(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                if(j>0 && j< y -1 && i>0 && i< x -1){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");

            }
            System.out.println();


        }
    }
}
