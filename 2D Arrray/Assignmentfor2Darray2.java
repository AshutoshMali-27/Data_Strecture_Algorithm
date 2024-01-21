public class Assignmentfor2Darray2 {
    
    public static void main(String args[]){

        int matrix[][]={{2,3,7},{5,6,7}};
        int row=2,col=3;

        printmatrix(matrix);
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        printmatrix(transpose);

        
    }

    public static void printmatrix(int matrix[][]){

        System.out.println("Transpose is :");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
