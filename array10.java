// Remove duplicates from sorted array & find number of unique elements

import java.util.*;

public class array10 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 3, 4, 4 };

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        System.out.println("no. of Unique elements are:" + (i + 1));
    }
}
