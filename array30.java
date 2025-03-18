// Majority element [Brute solution]

public class array30 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 4, 2, 2 };
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("majority value is:" + nums[i]);
                break;
            }
        }
    }
}
