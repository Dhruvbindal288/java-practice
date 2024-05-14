public class mergeSort {

    public static void mergesort(int arr[],int si,int ei){

        //JO APNE KO ISME KRNA HAI VO DEKHENGE
        if(si<ei){
            int mid=(si+ei)/2;
            mergesort(arr, si, mid); // left part
            mergesort(arr, mid + 1, ei);
            merge(arr,si,mid,ei);

        }

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei - si + 1];


        int i=si;       //iterartor for left part
        int j=mid+1;    //iterator for right part
        int k=0;        //iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{temp[k]=arr[j];
            j++;
            k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right part
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,1,2,5,9,7,8,4};
        int si=0;
int ei=arr.length-1;
        int mid=(si+ei)/2;
        mergesort(arr,si,ei);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
