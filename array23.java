
// lenth of longest of subarray with given sum S=;
import java.util.*;

public class array23 {
    public static int findingLenth(int nums[], int s) {
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                if (sum == s) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int s = 3;
        int lenth = findingLenth(arr, s);
        System.out.println("The lenth of longest subarray with sum=3 is: " + lenth);
    }
}
