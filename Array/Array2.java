public class Array2 {
    
    public static void main(String args[]){

        int marks[]={96,98,99};
        update(marks);

        
        for(int i=0;i<=3;i++){         
                System.out.print(marks[i] +" ");

        }
        System.out.println();


    }

    public static void update(int marks[]){
       
        for(int i=0;i<=marks.length;i++){

            marks[i]=marks[i] +1 ;

        }
        
    }
}
