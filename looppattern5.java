// loop pattern
// 10
// 12 14
// 16 18 20
// 22 24 26 28
// 30 32 34 36 38

import java.util.*;

public class looppattern5 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n = n + 2;
            }
            System.out.println();
        }
    }
}
