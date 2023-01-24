package arrays2D;

public class assignment {

    public static void search(int matrix[][]){

        int count =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("number of 7s in array:"+count);
    }

    public static void sumOfSecond(int nums[][]){
        int sum=0;
       
            for(int j=0;j<nums[0].length;j++){
            
                    sum+=nums[1][j];
                
            }
        
        System.out.println("sum of 2nd row is :"+sum);
    }


    public static void main(String[] args) {
        int[][] matrix = { {4,7,8},{8,8,7} }; 
        // search(matrix);
        // 2nd question
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        sumOfSecond(nums);
    }
}
