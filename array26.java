// twosum [TC=0(n^2)]

import java.util.*;

public class array26 {
    public static void main(String args[]) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("yes there is two numbers which sum = target: " + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }
}