public class Advancepattern1 {
    
    public static void main(String agrs[]){

        HollowPrectangle(4,5);
    }


    public static void HollowPrectangle(int row,int col){


        for(int i=1;i<=row;i++){
for(int j=1;j<=col;j++){

    if(i==1 ||i==row ||j==1 ||j==col){

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
