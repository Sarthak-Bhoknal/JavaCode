import java.util.*;

public class array7 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 7, 2 };

        int smallest = arr[0];
        int ss = arr[0] + 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ss = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < ss) {
                ss = arr[i];
            }
        }
        System.out.println("smallest:" + smallest);
        System.out.println("Second Smallest:" + ss);
    }
}
