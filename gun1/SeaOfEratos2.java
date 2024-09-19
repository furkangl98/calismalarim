package gun1;

public class SeaOfEratos2 {

    public static void main(String[] args) {
        int x =100;
        int[] a= new int[x-1];
        int y=0;
        for (int i = 2; i<=a.length; i++){
            a[y]=i;
            y++;
        }
        //{2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20}
        //{0-1-2-3-4-5-6-7-08-09-10-11-12-13-14-15-16-17-18}

        for (int i =0; i <=a.length-2 ; i++) {
            if(a[i]!=0){
                for (int j = a[i]; j <=a.length-2; j=j+j) {
                    if (a[i]==2){
                        for (int k = 0; k <a.length-2 ; k++) {
                            a[i+j]=0;
                        }

                    }
                    else if(a[i]==3){
                        for (int k = 0; k <a.length-2 ; k++) {
                            a[i+j]=0;
                        }
                    }
                    else if(j+a[i]<a.length-2){
                        a[j+a[i]]=0;
                    }
                }
            }
        }

        for (int j : a) {
            System.out.println(j);

        }
    }
}
