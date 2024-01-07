public class Advancepattern2 {
    
    public static void main(String args[]){
Inverted_Roteted_half_pyramid(4);
    }

    public static void Inverted_Roteted_half_pyramid(int n){

        for(int i=1;i<=n;i++){


            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print( "*" );
            }
            System.out.println();
        }

    }
}
