//The sum of all odd number from start number to end number

import java.util.Scanner;

public class odd_sum {
    public static void OddSum(int a, int b) {
        if (a > b) {
            System.out.println("Wrong input");
        } else {
            int sum = 0;
            while (a <= b) {
                if (a % 2 == 1) {
                    sum = sum + a;
                }
                a++;
            }
            System.out.println("The sum of all odd number from start to end:" + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from start:");
        int x = sc.nextInt();
        System.out.println("Enter the where the stop:");
        int y = sc.nextInt();

        OddSum(x, y);
    }
}