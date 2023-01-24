package arrays.sorting;

public class assignment {
    
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j = 0;j<arr.length-turn-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
              
            }
            int temp = arr[minPos];
            arr[minPos] =arr[i];
            arr[i] = temp;


        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            while(prev<=arr.length&&arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    }
    public static void main(String[] args) {
    int numbers[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(numbers);
        // selectionSort(numbers);
        insertionSort(numbers);
        printarr(numbers);
    }
}
