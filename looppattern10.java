// 1
// 23
// 456
// 78910

public class looppattern10 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i < 5; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
