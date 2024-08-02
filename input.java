import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Answer is:");
        System.out.println(sum);
    }
}
