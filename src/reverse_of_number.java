public class reverse_of_number {  public static void main(String[] args) {
    int n = 10899923;
    while(n>0){
        int lastdigit = n%10;
        System.out.print(lastdigit);
        n = n/10;
    }
}
}
