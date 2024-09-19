package gun1;

public class SieveOfEratosthenesAsal {
    public static void main(String[] args) {
        int x = 113;
        int[] a = new int[x + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < Math.sqrt(a.length); i++) {
            if (a[i] == 0)
                continue;
            else if (a[i] == 1){
                a[i]=0;
                continue;
            }
            else {
                for (int j = a[i]; j < a.length; j = j + a[i]) {
                    if(j+a[i]<a.length){
                        a[j + a[i]] = 0;
                    }
                }
            }
        }
        for (int c : a) {
            System.out.println(c);
        }
    }
}
