package Session03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arrSecond = {2, 4, 6, 8, 9, 10};
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i != arrayFirst.length && j != arrSecond.length) {
            if (arrayFirst[i] > arrSecond[j]) {
                arr.add(arrSecond[j]);
                j++;
            } else {
                arr.add(arrayFirst[i]);
                i++;
            }
        }

        if (i == arrayFirst.length) {
            for (int k = j; k < arrSecond.length; k++) {
                arr.add(arrSecond[k]);
            }
        } else {
            for (int k = i; k < arrayFirst.length; k++) {
                arr.add(arrSecond[k]);
            }

        }

        System.out.println(arr);
    }
}
