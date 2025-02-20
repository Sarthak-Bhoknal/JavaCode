
// linear search (for first occurance)
import java.util.*;

public class array15 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;

        int num = 4;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println(num + " on index " + i);
            } else {
                System.out.println("Number is not Found");
            }
        }
    }
}
