//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class binomial_coefficient {
    public binomial_coefficient() {
    }

    public static int factorial(int n) {
        int f = 1;

        for(int i = 1; i <= n; ++i) {
            f *= i;
        }

        return f;
    }

    public static int binocoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binocoff = fact_n / (fact_r * fact_nmr);
        return binocoff;
    }

    public static void main(String[] args) {
        System.out.println(binocoff(5, 3));
    }
}
