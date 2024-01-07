public class FunctionOverloading {
    
    public static void main(String args[]){

System.out.println(sum(1,2,3));
System.out.println(sum(4,5));
System.out.println(mul(3,4));
System.out.println(mul(3.4f,4.6f));
    }


    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int mul(int a,int b){
        return a*b;
    }

    public static float mul(float a,float b){
        return a*b;
    }

//java support Function Overloading
//Multiple function with same name but different parameter
//Function overloading happen with two ways
// -using parameter
// -using Datatype
}
