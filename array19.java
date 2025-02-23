
//finding missing number from 1 to N [Optimal solution]
import java.util.*;

public class array19 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7 }; // missing is 4
        int N = 7;

        int sum = N * (N + 1) / 2;

        // System.out.println("sum is: " + sum);

        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            s2 = s2 + arr[i];
        }

        System.out.println("The missing number is:" + (sum - s2));
    }
}
