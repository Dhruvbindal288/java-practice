//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class arrys {
    public arrys() {
    }

    public static void reverse(int[] number) {
        int first = 0;

        for(int last = number.length - 1; first < last; --last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            ++first;
        }

    }

    public static void pairs(int[] number) {
        for(int i = 0; i < number.length; ++i) {
            int start = number[i];

            for(int j = i + 1; j < number.length; ++j) {
                System.out.print("(" + start + "," + number[j] + ")");
            }

            System.out.println();
        }

    }

    public static void subarrays(int[] number) {
        for(int i = 0; i < number.length; ++i) {
            int start = i;

            for(int j = i; j < number.length; ++j) {
                int last = j;

                for(int k = start; k <= last; ++k) {
                    System.out.print(number[k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }

    }

    public static void sumsubarray(int[] number) {
       // int currsum = false;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < number.length; ++i) {
            int start = i;

            for(int j = i; j < number.length; ++j) {
                int last = j;
                int currsum = 0;

                for(int k = start; k <= last; ++k) {
                    currsum += number[k];
                }

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.print("Max sum is: " + maxsum);
    }

    public static void kadanealgo(int[] number) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < number.length; ++i) {
            cs += number[i];
            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        System.out.println("Max Sum is: " + ms);
    }

    public static void main(String[] args) {
        int[] number = new int[]{2, 4, -6, 8, -10};
        kadanealgo(number);
    }
}
