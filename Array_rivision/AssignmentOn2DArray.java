import java.util.Scanner;

public class AssignmentOn2DArray {
    
    public static void main(String args[]){
        //commit code as per requirement
        int matrix[][]=new int [3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        int key=30;
        System.out.println(search(matrix, key));

        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
         printspiral(matrix);


      int matrix[][]={{10,20,30,40},
      {15,25,35,45},
      {27,29,37,48},
      {32,33,39,50}};
      int key=33;
      staircaseSearch(matrix,key);
      //System.out.print(diagonalSum(matrix));
        
    }


    public static boolean search(int matrix[][],int key){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at position"+i+""+j);
                    return true;
                }
            }
        }
        return false;
    }


    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+ " ");

            }

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+ " ");
            }

            for(int j=endcol-1;j>=startcol;j--){

                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                if(endcol==startcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();

    }


    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j ==matrix.length-1){
                    sum += matrix[i][j] ;
                }
            }
        }

        return sum;

    }


    public static boolean staircaseSearch(int matrix[][] ,int key){
        int row =0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at position"+row+"," +col+"");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not Found");
        return false;
    }
}

