//finding missing number from 1 to N [TC=O(nxn)]

import java.util.*;

public class array18 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int N = 5;

        int n = arr.length;

        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("missing number is:" + i);
            }
        }
    }
}
