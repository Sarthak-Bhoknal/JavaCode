import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int size= sc.nextInt();
        int arr[]=new int[size];

        // for input 
        System.out.println("Enter element:");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        // for output
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
