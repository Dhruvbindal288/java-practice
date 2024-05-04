//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class callByValue {
    public callByValue() {
    }

    public static void swap(int a, int b) {
        System.out.println("Value of a is: " + b);
        System.out.println("Value of b is: " + a);
    }

    public static void main(String[] args) {
        int a = 34;
        int b = 23;
        swap(a, b);
    }
}
