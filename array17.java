//intersection of two array [logic 2]- Optimize solution

import java.util.*;

public class array17 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };
        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else if (arr1[i] == arr2[j]) {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println("Intersection:" + intersection);
    }
}