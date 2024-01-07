public class BtoDconverter {
    public static void main(String args[]){


        bintoDec(1101);
    }



    public static void bintoDec(int binnum){
        int pow=0;
        int decNum=0;

        while(binnum >0){
            int lastDigit=binnum%10;
            decNum=decNum+(lastDigit* (int)Math.pow(2, pow));
            binnum=binnum/10;
            pow++;
        }


        System.out.println("decimal of" + binnum + " =" +decNum);
    }
}



// dec=dec +ld*2pow()