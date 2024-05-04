import java.util.*;
public class matrix {

    public static void matrixx(){}
    public static void largest(int matrix[][]) {
        int largest_number= Integer.MIN_VALUE;
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
if(matrix[i][j]>largest_number){
    largest_number=matrix[i][j];
}
            }

        } System.out.print(largest_number);
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n= matrix.length, m= matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){

              matrix[i][j]=sc.nextInt();

            }
        }
        //output of 2D array

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Largest number of matrix is: ");
        largest(matrix);
    }

}
