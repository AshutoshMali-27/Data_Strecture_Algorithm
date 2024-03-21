//1.find person adult or not
//2.fond no.enven or odd
//3.wap to show a oor b are euqal greater or lesser
//4.Wap to press button for gretting using elseif and switch
//5.made a calculator using aritmatic operator
//6.print no 1 to 10 using for loop, while loop and do while loop
//7.print sum of first n natiral no.
//8.print all even no. till n
//9 squre pattern
//10.hollow square
//11.print half pyramid
//12.Inverted half Pyramid
//13.Reverse Half Pyramid
//14. pyramid no.
import java.util.Scanner;

public class Rivisionofbasicjava {

    public static void main(String args[]){

        // Scanner sc=new Scanner(System.in);
        // int age=sc.nextInt();


        // if(age>18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }

        // Scanner sc=new Scanner((System.in));
        // int number=sc.nextInt();

        // if(number % 2==0){
        //     System.out.println("even no");
        // }else{
        //     System.out.println("odd no");
        // }


    //  Scanner sc=new Scanner(System.in);
    //  int a=sc.nextInt();
    //  int b=sc.nextInt();
    //  if(a==b){
    //     System.out.println("ais equal to b");
    //  }
    //  else if(a>b){
    //     System.out.println("a is greter then b");
    //  }
    //  else{
    //     System.out.println("b is greter then a");
    //  }

    // Scanner sc=new Scanner(System.in);
    // int button=sc.nextInt();
    // if(button ==1){
    //     System.out.println("hello");
    // }
    // else if(button ==2){
    //     System.out.println("namste");
    // }
    // else{
    //     System.out.println("bonjour");
    // }


    // switch(button){
    //     case 1:System.out.println("hello");
    //     break;
    //     case 2:System.out.println("namste");
    //     break;
    //     case 3:System.out.println("Bonjour");
    //     break;
    //     default:System.out.println("invalid button");

    // }

    // Scanner sc=new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // int operator=sc.nextInt();

    // switch (operator) {
    //     case 1:System.out.println(a+b);
    //         break;
    //         case 2:System.out.println(a-b);
    //         break;
    //         case 3:System.out.println(a*b);
    //         break;
    //         case 4:System.out.println(a/b);
    //         break;
    //         case 5:System.out.println(a%b);
    //         break;
    //     default:System.out.println("invalid operaton");
            
    // }

    // for(int i=0;i<11;i++){
    //     System.out.print(i+" ");
    // }

    // int i=0;
    // while (i<11) {
    //     System.out.print(i +" ");
    //     i++;
        
    // }

    // int i=0;
    // do{
    //     System.out.print(i+" ");
    //     i++;
    // }
    // while(i<11);
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
// int sum=0;
//     for(int i=0;i<=n;i++){

//         sum=sum+i;
        
//     }
//     System.out.println(sum);

// Scanner sc=new Scanner(System.in);
// int even=sc.nextInt();

// for(int i=0; i<=even;i++){

//     if(i%2==0){
//         System.out.print(i+" ");
//     }
// }
// int n=5;
// int m=4;
// for(int i=0;i<=n;i++){
//     for(int j=0;j<=m;j++){
//         System.out.print("*");
//     }

//     System.out.println();
// }
// int n=5;
// int m=4;

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if(i==1 || j==1 || i==n || j==m){
//             System.out.print("*"+" ");
//         }
//         else{
//             System.out.print(" "+" ");
//         }
       
//     }
//     System.out.println();
  
// }

// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// int n=4;
// for(int i=n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){

//         System.out.print("*");
//     }

//     System.out.println();
// }

// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

int n=5;
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}

    }
    
}