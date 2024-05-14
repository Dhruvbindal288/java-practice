//import java.sql.SQLOutput;
//import java.util.*;
//public class RecursionPractise {
//    public static void PrintDec(int n){
//        if(n==1){
//            System.out.print(n);
//            return;
//        }
//        System.out.print(n+" ");
//        PrintDec(n-1);
//    }
//    public static int Fact(int n){
//        if(n==0){
//            return 1;
//        }
//        int fxn=Fact(n-1);
//        int fn=n*Fact(n-1);
//        return fn;
//    }
//    public static int Sum(int n){
//        if(n==0){
//            return 1;
//        }
////        int fxn=Sum(n-1);
//        int fn=n+Sum(n-1);
//        return fn;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in );
//        System.out.print("Choose Your Number:");
//        int n= sc.nextInt();
//PrintDec(n);
//        System.out.println(", Factorial of n:"+Fact(n));
//        System.out.println("sum"+Sum(n));
//    }
//}
