//intersection of two array [logic 1]

import java.util.*;

public class array16 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };
        int n1 = arr1.length;
        int n2 = arr2.length;

        int visited[] = new int[n2];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = 0;
        }

        ArrayList<Integer> intersec = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    intersec.add(arr1[i]);
                    k++;
                    visited[j] = 1;
                    break;
                }
            }
        }
        System.out.println("intersection array:" + intersec);
    }
}
