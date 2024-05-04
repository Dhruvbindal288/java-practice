//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class binarytodecimal {
    public binarytodecimal() {
    }

    public static void binnum(int binnum) {
        int myNum = binnum;
        int pow = 0;

        int dec;
        for(dec = 0; binnum > 0; binnum /= 10) {
            int lastdigit = binnum % 10;
            dec += lastdigit * (int)Math.pow(2.0, (double)pow);
            ++pow;
        }

        System.out.println("Your decimal Number of " + myNum + " is " + dec);
    }

    public static void main(String[] args) {
        binnum(100);
    }
}
