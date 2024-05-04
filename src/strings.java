import java.util.*;

public class strings {
   public static void printstring(String fullname){
       for(int i =0; i<fullname.length();i++){
           System.out.print(fullname.charAt(i) +" ");
       }
       System.out.println();
   }
   public static boolean palindrome(String str){
       for(int i=0;i<str.length();i++){
           int n=str.length();
           if(str.charAt(i)!= str.charAt(n-i-1)){
               //not a palindrome
               System.out.println("Given String is not palindrome");
               return false;
           }
       }
       System.out.println("yes");
       return true;
   }

   public static float shortestpath(String str){
       int x=0,y=0;
       for(int i=0;i<str.length();i++){
           char direction=str.charAt(i);
           if(direction=='N'){
               y++;
           } else if(direction=='S'){
               y--;
           }
           else if(direction=='W'){
               x--;
           }
           else {
               x++;
           }
       }
       int X2=x*x;
       int Y2=y*y;
       return (float) Math.sqrt(X2+Y2);
   }
    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//    String fullname;
//    System.out.print("Please enter your FullName: ");
//        fullname = sc.nextLine();
//        System.out.println("Printing your FullName here: "+ fullname);
//        System.out.println("Number of Character is: "+ fullname.length());
//        System.out.println(fullname.charAt(6));
//   printstring(fullname);


//   String str="WENSWENNSWE";
//   palindrome(str);
//   System.out.println(shortestpath(str));
//   System.out.println(str.substring(1,4));
//String fruit[]={"mango","apple","banana","kiwi"};
//String largest=fruit[0];
//for(int i=0;i< fruit.length;i++){
//    if(largest.compareTo(fruit[i])<0){
//        largest=fruit[i];
//    }
//}
//        System.out.println(largest);

   // String Builder
        StringBuilder sd=new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
            sd.append(ch);
        }
        System.out.println(sd);
   }
}