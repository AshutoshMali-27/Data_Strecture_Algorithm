public class SpiralMatrix {

    public static void main(String args[]){

        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

                        printspiral(matrix);
    }

    public static void printspiral(int matrix[][]){

        int sc=0;
        int sr=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;


        while(sr<=er && sc<=ec){

            //top
            for(int j=sc ;j<=ec;j++){
                System.out.print(matrix[sr][j]+" " );
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.print(matrix[i][ec]+" ");
            }
            //bottom
            for(int i=ec-1;i>=sc;i--){
                if(sr==er){
                    break;
                }
                System.out.print(matrix[er][i]+" ");
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc ==ec){
                    break;
                }
                System.out.print(matrix[i][sc]+ " ");
            }


            sr++;
            sc++;
            ec--;
            er--;
        }

        System.out.println();
    }
}