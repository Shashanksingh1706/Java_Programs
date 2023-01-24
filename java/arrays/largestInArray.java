package arrays;

public class largestInArray {

        public static int getLargest(int numbers[]){
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for(int i=0;i<numbers.length;i++){
            
                if(numbers[i]>largest){
                    largest =numbers[i];
                }
                if(smallest>numbers[i]){
                    smallest = numbers[i];
                }
            }
            System.out.println("smallest number in an array is : "+ smallest);
            return largest;
        }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest number in an array is : "+getLargest(numbers));
    }
}
