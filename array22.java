
// find that number that appears once and other numbers twice [Optimal solution]
//xor states that same twice number gives '0'
import java.util.*;

public class array22 {
    static int finding(int nums[]) {
        int xorr = 0;
        for (int i = 0; i < nums.length; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 2, 2, 3, 3, 5, 4, 4 };
        int ans = finding(arr);
        System.out.println("number that appears once is:" + ans);
    }
}
