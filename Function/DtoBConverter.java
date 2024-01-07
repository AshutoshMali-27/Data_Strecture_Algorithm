public class DtoBConverter {
    
    public static void main(String args[]){
decToBin(7);
    }


    public static void decToBin(int n){

        int mynum=n;
        int pow=0;
        int binnum=0;

        while(n>0){

            int rem=n%2;
            binnum=binnum +(rem * (int) Math.pow(10, pow));
            n=n/2;
            pow++;
        }


        System.out.println("binary Form of "+ mynum+"="+binnum);
    }



}


//logic
// while(n>0){
//     divide by 2 and get rem
//     bin=bin+rem*10pow();
//     pow++;
// }