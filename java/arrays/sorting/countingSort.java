package arrays.sorting;

public class countingSort {

    public static void countingSorting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                i--;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSorting(arr);
        printarr(arr);
    }
}
