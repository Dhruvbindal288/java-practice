public class pattern {
    public static void hollow_pattern(int totrow,int totcol){

        //outer loop
        for(int i =1;i<=totrow;i++){

            //inner loop
            for(int j=1;j<=totcol;j++){
                if(i==1 ||i==totrow|| j==1|| j==totcol
                )
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }


    }

 public static void inverted_pyramid(){
        int n=4;
        for(int i =1; i<=4;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

 }

 public static void floyd_triangle(int n){
        int counter =1;
        //outer loop
     for(int i =1; i<=n;i++){
         //what to print
         for(int j =1;j<=i;j++){
             System.out.print(counter+" ");
             counter ++;
         }
         System.out.println( );
     }
    }

    public static void triangle01(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0){System.out.print("1 ");}
               else{
                   System.out.print("0 ");
               }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
for(int i=4;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

    }
    public static void main(String[] args) {
//    for(int i =1; i<=5; i++){
//        System.out.println("*****");
//    }

      hollow_pattern(4,5);
//inverted_pyramid();

//        floyd_triangle(5);
//triangle01(5);
  butterfly(4);
    }
}
