public class CountSetbit {
    public static void main(String args[]){

       System.out.println(CountSterbit(15)); 


    }

    public static int CountSterbit(int n){
        int count =0;
        while (n>0) {
            if((n& 1) !=0){
                count++;
            }
          n=  n>>1;
            
        }

        return count;
    }
}
