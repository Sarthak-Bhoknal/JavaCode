// twosum [Optimal solution]

import java.util.Arrays;

public class array27 {

    public static String findtwosum(int arr[], int n, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 11 };
        int n = 5;
        int target = 14;
        String ans = findtwosum(arr, n, target);
        System.out.println("Is Twosum yes/not?:" + ans);
    }
}
