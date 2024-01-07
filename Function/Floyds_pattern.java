public class Floyds_pattern {
    
    public static void main(String args[]){

        Floyds_Triangle(5);
    }

    public static void Floyds_Triangle(int n){

        int counter=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
}
