
//left rotate an array by D places 
import java.util.*;

public class array12 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int d = 3;
        int n = arr.length;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        int j = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
