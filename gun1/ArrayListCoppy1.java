package gun1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListCoppy1 {
    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 15, 7, 15, 8};
        Set<Integer> set=new LinkedHashSet<>();
        for (int num : originalArray) {
            set.add(num);
        }
        System.out.println(set);


    }


}
