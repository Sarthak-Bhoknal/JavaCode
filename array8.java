//check array is sorted or not

import java.util.*;

public class array8 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 4, 10, 5 };
        boolean issorted = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                issorted = false;
                System.out.println("Array is not sorted");
                break;
            }
        }
        if (issorted) {
            System.out.println("Array is sorted");
        }
    }
}
