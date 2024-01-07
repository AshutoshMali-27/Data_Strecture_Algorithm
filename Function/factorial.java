public class factorial {
    
    public static void main(String args[]){
int num=5;

      int factorial=  fact(5);
        System.out.println("Factorial of "+num+" is ="+factorial);
    }


    public static int fact(int num){

int fact=1;
for(int i=1;i<=num;i++){
    fact = fact*i;

}
return fact;

    }
}
