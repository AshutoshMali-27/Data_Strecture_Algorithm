public class Assignmentfor2Darray {
    
    public static void main(String args[]){
        int matrix[][]={{4,7,8},{8,8,7}};

        int counter=0;
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j] ==7){
                    counter++;
                }
            }
        }

        System.out.println("count of 7 is "+counter);

    }


}
