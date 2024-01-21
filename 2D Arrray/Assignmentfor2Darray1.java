public class Assignmentfor2Darray1 {
 
    public static void main(String args[]){

        int matrix [][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;

        for(int i=0;i<matrix[0].length;i++){
          
            sum=sum+matrix[1][i];

        }

        System.out.print("Sum is :" +sum);
    }
}
