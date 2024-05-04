public class primenumber {
    public static boolean isprime(int n){
       boolean isprime = true;
       for (int i= 2;i<=(n-1);i++){
           if(n%i==0){isprime=false;}
       }
        return isprime;
    }
    public static void primeinrange(int n){
        for (int i =2;i<=n-1;i++){
           if (isprime(i)){
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String[] args) {
      primeinrange(34);
    }
}

