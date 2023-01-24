package arrays2D;

public class diagonalSum {

    public static void diagSum(int matrix[][]){

        int sum=0;

        // for(int i=0;i<matrix.length;i++){                 0(n^2)
        //     for(int j=0;j<matrix[0].length;j++){
        //          if(i==j){
        //             sum+=matrix[i][j];
        //          }
        //         else if(i+j==matrix.length-1){
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }

        //optimised code
            for(int i=0;i<matrix.length;i++){
                sum+=matrix[i][i];
                if(i!=matrix.length-1-i){
                    sum+=matrix[i][matrix.length-1-i];
                }
            }


        System.out.println("sum:"+sum);
    }

    public static void main(String[] args) {
        int arr[][] = {{1 ,2 ,3},
                        {4 ,5 ,6},
                        {7 ,8 ,9}};
                        diagSum(arr);
    }
}
