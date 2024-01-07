public class BinomialCoeffcient {
    
public static void main(String args[]){
     int n=5;
    int r=3;
   
float bincoeff =bincoeff(5,3);

System.out.println(bincoeff);

}


public static int bincoeff(int n,int r){
   
int factn=factofn(n);
int factr=factofn(r);
int factn_r=factofn(n-r);

int bincoeff=factn/((factr)*(factn_r));
return  bincoeff;
}

public static int factofn(int n){

    int fact=1;
    for(int i=1;i<=n;i++){
        fact = fact*i;
    
    }
    return fact;
    
        }



    }