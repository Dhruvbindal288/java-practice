import java.util.*;
public class loops {

        public static void main(String[] args) {

// for loop-------------->

            //         int x=5;
//         for(int i=2;;){
//           if((x%i)!=0){System.out.println("number is prime");}
//             else{System.out.println("number is not prime");}break;
// }

// while loop---------->

// int n = 10899923;
//
// while(n>0){
//     int lastdigit = n%10;
//     System.out.print(lastdigit);
// n = n/10;
// }

// do while loop------------->

// int i =1;
// do{
//     System.out.println("Hello Dhruv");
//     i++;
// }while (i<=10);

            Scanner sc= new Scanner(System.in);
            System.out.println("enter number: ");
            int a= sc.nextInt();


            do {
                System.out.println(a);
                if (a%10==0){break;}
            }while(true);



        }

    }
