public class Hollow_Rhombus {
    
    public static void main(String args[]){

HollowRhombus(5);
    }

    public static void HollowRhombus(int n){

    
        for(int i=1;i<=n;i++){

            //print empty spaces
            for(int j=1;j<=(n-i);j++){

                System.out.print( " ");
            }
            for(int j=1;j<=n;j++){

                if(i==1 || i== n ||j==n || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
