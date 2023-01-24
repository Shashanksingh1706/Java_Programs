package arrays;

public class arrrayq1 {

    public static boolean arrayCheck(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;i<numbers.length;i++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};
        boolean check = arrayCheck(numbers);
        System.out.println(check);
    }
}
