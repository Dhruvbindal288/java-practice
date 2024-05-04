import java.util.*;
public class funtionss {
    public static void hello(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    };
public static void sumcal(int a,int b){// parameter

int sum = a+b;
    System.out.println(sum);
}

    public static void main(String[] args) {
//        hello();
        Scanner sc=new Scanner(System.in);
        System.out.print("Your first number is: ");
        int a =sc.nextInt();
        System.out.print("Your second number is: ");
        int b =sc.nextInt();
        sumcal(a,b);  // argument
}
}
