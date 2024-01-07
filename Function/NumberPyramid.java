public class NumberPyramid {
    public static void main(String agrs[]){

        numberpyramid(5);
    }
    public static void numberpyramid(int n){

      int  counter =1;

      for(int i=1;i<=n;i++){

        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }

        for(int j=1;j<=i;j++){

            // if(j%2 == 0){
            //     System.out.print( " ");
            // }
            // else{
            //     System.out.print( i);
            //     counter++;
            // }
            System.out.print(i+" ");
        }
        System.out.println();
      }
    }
}
