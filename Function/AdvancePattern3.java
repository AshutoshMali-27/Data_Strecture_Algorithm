public class AdvancePattern3 {
    
    public static void main(String args[]){
Inverted_Pyramid_pattern(5);
    }

    public static void Inverted_Pyramid_pattern(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i+1);j++){

                System.out.print(j);
            }
            System.out.println();
        }

    }
}
