import java.lang.reflect.GenericDeclaration;
import java.util.*;
public class search {
    public static int largest_number(int numbers[]){
int largest_number= Integer.MIN_VALUE;
for (int i=0;i<numbers.length;i++){
    if (largest_number < numbers[i]) {
            largest_number=numbers[i];
    }

}
        return largest_number;
    }

    public static int binarysearch(int numbers[],int key){
int start=0;
int last=numbers.length-1;
while(start<=last){
    int mid=(start+last)/2;
    if (numbers[mid]==key) {
       return mid;
    }
    if (numbers[mid]>mid) {
        start=mid+1;
    }else{last=mid-1;};

}


    return -1;}


    public static void main(String[] args) {
int numbers[]={1,2,3,4,5,6,7,8,9};
int key=7;
//        System.out.println("Number is :"+largest_number(numbers));
        System.out.println(binarysearch(numbers,key));
    }
}
