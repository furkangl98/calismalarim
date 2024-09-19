package gun1;

import java.util.Arrays;

public class ArrayListCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 15, 7, 15, 8};

        int[] copyArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (copyArray[j] == copyArray[i]) {
                    copyArray[j] = 0;
                }
            }
        }
        int count = 0;
        for (int value : copyArray) {
            if (value != 0) {
                count++;
            }
        }
        int[] copyArray1 = new int[count];
        int x = 0;
        for (int i : copyArray) {
            if (i != 0)
                    copyArray1[x++] = i;
        }
        System.out.println(Arrays.toString(copyArray1));

    }

}
