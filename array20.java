
// maximum consecutive number of 1's  
import java.util.*;

public class array20 {
    static int findMaxConsecutive(int arr[]) {
        int counter = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
            } else {
                counter = 0;
            }
            maxi = Math.max(maxi, counter);
        }
        return maxi;
    }

    public static void main(String args[]) {
        int array[] = { 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1 };
        int ans = findMaxConsecutive(array);
        System.out.println("Maximum consecutive number of 1's: " + ans);
    }
}
