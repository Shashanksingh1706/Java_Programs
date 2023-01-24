package arrays2D;

public class transposeMatrix {
    public static void main(String[] args) {
        int rows =2, cols =3;
        int matrix[][] = {{2,3,7},{3,6,7}};

        printMatrix(matrix);
        int transpose[][] = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
