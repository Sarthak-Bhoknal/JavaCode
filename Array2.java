
// Ques- get Largest number in array

import java.util.*;

public class Array2 {
    public static void main(String args[]) {
        int[] numbers = { 1, 2, 3, 9, 7, 6 };

        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
