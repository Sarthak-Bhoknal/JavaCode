//sort arrays of 0's 1's 2's [better solution]

import java.util.*;

public class array29 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 2, 1, 0, 0, 0, 1 };
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int j = 0; j < count0; j++) {
            arr[j] = 0;
        }
        for (int k = count0; k < count0 + count1; k++) {
            arr[k] = 1;
        }
        for (int l = count0 + count1; l < count0 + count1 + count2; l++) {
            arr[l] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}