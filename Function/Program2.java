public class Program2 {
    
    public static void swap(int num1,int num2){


        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping: "+ "First number is :" + num1);
        System.out.println("After swapping: "+ "Second number is :" + num2);
    }
    
    public static void main(String args[])
    {

        int num1=4;
        int num2=8;

        swap(2,8);

    }
}
