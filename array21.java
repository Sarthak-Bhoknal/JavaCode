
// find that number that appears once and other numbers twice
import java.util.*;

public class array21 {
    static int finding(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            int n = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == n) {
                    counter++;
                }
            }
            if (counter == 1) {
                return nums[i];
            }
        }
        return -1; // If no number appears once, return -1 or any value you prefer.
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
        int ans = finding(arr);
        System.out.println("Number that appears once is: " + ans);
    }
}
