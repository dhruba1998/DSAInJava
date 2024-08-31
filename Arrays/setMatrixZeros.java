package Arrays;

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

public class setMatrixZeros {

    // Assuming matrix has only two values 1 and 0
    public static void setColumn(int[][] matrix,int j){
        for(int row=0;row<matrix.length;row++){
            if(matrix[row][j]!=0) matrix[row][j]=-1;
        }
    }

     // Assuming matrix has only two values 1 and 0
    public static void setRow(int[][] matrix,int i){
        for(int column=0;column<matrix[0].length;column++){
            if(matrix[i][column]!=0) matrix[i][column]=-1;
        }
    }

    public static void setZeros(int[][] matrix){

        for(int i=0 ; i<matrix.length; i++){
            for(int j =0;j<matrix[0].length;j++){
                
                if(matrix[i][j]==0){
                    setColumn(matrix,j);
                    setRow(matrix,i);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    // This is brute force solution
    public static void main(String[] args) {
        
        int[][] matrix = {{0,1,1,0},
                          {1,1,1,1},
                          {1,1,1,1}};

       setZeros(matrix);

       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


    
}