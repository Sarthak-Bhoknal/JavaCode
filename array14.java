// move all zeros to the end of the array [Optinal solution] TC=O(n)

import java.util.Arrays;

public class array14 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 0, 5, 0, 6, 0, 0, 7, 7 };
        int n = arr.length;

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("final result:" + Arrays.toString(arr));
    }
}
