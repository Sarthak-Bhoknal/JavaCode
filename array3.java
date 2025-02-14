
// get smallest number in array 
import java.util.*;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int num[] = new int[size];

        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        int smallest = num[0];
        for (int i = 1; i < size; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println("The smallest number is " + smallest);
    }
}
