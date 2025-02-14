// find the second largest element in array  TC=O(2N)

import java.util.*;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int nums[] = new int[size];
        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int largest = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("Largest is " + largest);

        // for second largest

        int sl = -1;
        for (int i = 0; i < size; i++) {
            if (nums[i] > sl && nums[i] != largest) {
                sl = nums[i];
            }
        }
        System.out.println("Second largest is " + sl);
    }
}
