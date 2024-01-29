public class UpdateIthbit {
    public static void main(String args[]){
System.out.println(Updateithbit(10,2,1));
    }
    public static int Updateithbit(int n,int i,int newBit){

        if(newBit ==0){
            return  ClearIthbit(n, i);
        }
        else{

          return  setIthbit(n, i);
        }
    }
    public static int ClearIthbit(int n,int i){
        int bitMask =~(1<<i);
        return n& bitMask;
    }
    public static int setIthbit(int n,int i){
        int bitmask=1<<i;
      return n|bitmask;
    }

}
