public class ClearIthbit {
    public static void main(String args[]){

        System.out.println(ClearIthbit(10, 1));
    }
    public static int ClearIthbit(int n,int i){
        int bitMask =~(1<<i);
        return n& bitMask;
    }
}

