
// find the second largest element in array  TC=O(N)

import java.util.*;

public class array5 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };

        int largest = arr[0];
        int seclargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                seclargest = largest; // take the largest
                largest = arr[i]; // then replace the largest
            } else if (arr[i] < largest && arr[i] > seclargest) {
                seclargest = arr[i];
            }
        }
        System.out.println("Second largest " + seclargest);
    }
}
