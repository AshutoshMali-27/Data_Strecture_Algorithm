public class PalindromicPattern {
    
    public static void main(String args[]){
palindrompattern(5);
    }

    public static void palindrompattern(int n){


        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //dec
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //asc
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
