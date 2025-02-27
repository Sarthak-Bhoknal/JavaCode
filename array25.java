// lenth of longest of subarray with given sum k=; [optimal solution]

public class array25 {
    public static int findingLenth(int arr[]) {
        int n = arr.length;
        int k = 6;
        int sum = arr[0];
        int maxlen = 0;
        int left = 0, right = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum = sum + arr[right];
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int ans = findingLenth(arr);
        System.out.println("lenth of longest of subarray with given sum k is " + ans);

    }
}
