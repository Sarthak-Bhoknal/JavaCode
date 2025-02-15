//check array is sorted (Descending) or not

public class array9 {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 4, 2, 1 };
        boolean issorted = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] <= arr[i]) {
                issorted = true;
            } else {
                System.out.println("array is not sorted");
                break;
            }
        }
        if (issorted) {
            System.out.println("array is sorted (descending)");
        }
    }
}
