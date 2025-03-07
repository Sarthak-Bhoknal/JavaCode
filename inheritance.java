// *** Heirarchical Inheritance ***

import java.util.Scanner;

class BaseClass {
    Scanner sc = new Scanner(System.in);
    public int a, b;

    public void TakeInput() {
        a = sc.nextInt();
        b = sc.nextInt();
        // this.a=a;
        // this.b=b; ## When Parameter is passed
    }
}

class Derivedclass01 extends BaseClass {
    public void add() {
        System.out.println(a + b);
    }
}

class Derivedclass02 extends BaseClass {
    public void sub() {
        System.out.println(a - b);
    }
}

public class inheritance {
    public static void main(String args[]) {
        Derivedclass01 obj = new Derivedclass01();
        obj.TakeInput();
        obj.add();

        Derivedclass02 object = new Derivedclass02();
        object.TakeInput();
        object.sub();
    }
}