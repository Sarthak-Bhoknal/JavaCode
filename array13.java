// move all zeros to the end of the array [my logic]

import java.util.Arrays;

public class array13 {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 3, 0, 1, 3, 7, 0, 2, 0 };
        int n = arr.length;

        int zerocount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zerocount++;
            }
        }
        System.out.println("number of zeros:" + zerocount);

        int[] arrayof_zero = new int[zerocount];
        int[] arrayof_nonzero = new int[n - zerocount];
        int nz = arrayof_nonzero.length;

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arrayof_zero[j] = arr[i];
                j++;
            }
        }
        System.out.println("Array of zero:" + Arrays.toString(arrayof_zero));

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arrayof_nonzero[k] = arr[i];
                k++;
            }
        }
        System.out.println("Array of non-zero" + Arrays.toString(arrayof_nonzero));

        int[] final_array = new int[n];

        int x = 0;
        for (int i = 0; i < nz; i++) {
            final_array[i] = arrayof_nonzero[x];
            x++;
        }

        int y = 0;
        for (int i = nz; i < n; i++) {
            final_array[i] = arrayof_zero[y];
            y++;
        }

        System.out.println(
                "Final array is(after moving all zeros to the end of the array):" + Arrays.toString(final_array));
    }
}
