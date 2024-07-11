
import java.util.*;
public class OperationonAL {


public static void main(String args[]){

    ArrayList<Integer> List1 = new ArrayList<>();

    List1.add(2);
    List1.add(3);
    List1.add(4);
    List1.add(7);

    // System.out.println(List1);

    // int element=List1.get(2);
    // System.out.println(element);

    // List1.remove(2);
    // System.out.println(List1);

    // List1.set(2, 78);
    // System.err.println(List1);


    // System.out.println(List1.contains(78));

    // System.out.println(List1);
    // List1.size();

    // for(int i=0;i<List1.size();i++){

    //     System.out.print(List1.get(i) +" ");
    // }
    // System.out.println();

    // ArrayList<Integer> List=new ArrayList<>();
    // List.add(1);
    // List.add(2);
    // List.add(3);
    // List.add(4);
    // List.add(5);

    // for(int i=List.size()-1;i>=0;i--){
    //     System.out.print(List.get(i)+ " ");
    // }
    // System.out.println();

    // ArrayList<Integer> List3=new ArrayList<>();
    // List3.add(2);
    // List3.add(5);
    // List3.add(9);
    // List3.add(6);
    // List3.add(8);

    // int max=Integer.MIN_VALUE;
    // for(int i=0;i<List3.size();i++){

    //     if(max <List3.get(i)){
    //         max=List3.get(i);

    //     }

    // }
    // System.out.print(max);

    // ArrayList<Integer>listswap=new ArrayList<>();
    // listswap.add(2);
    // listswap.add(5);
    // listswap.add(9);
    // listswap.add(3);
    // listswap.add(6);

    // int idx1=1;
    // int idx2=3;
    // System.out.println(listswap);
    // swap(listswap, idx1, idx2);
    // System.out.println(listswap);
//     ArrayList<Integer> sortlist=new ArrayList<>();
//     sortlist.add(2);
//     sortlist.add(5);
//     sortlist.add(9);
//     sortlist.add(3);
//     sortlist.add(6);



//     System.out.println(sortlist);
//     Collections.sort(sortlist);
//     System.out.println(sortlist);

//     Collections.sort(sortlist,Collections.reverseOrder());
// System.out.println(sortlist);

ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
ArrayList<Integer>list=new ArrayList<>();
list.add(1);
list.add(2);
mainlist.add(list);

ArrayList<Integer>list2=new ArrayList<>();
list2.add(3);
list2.add(4);
mainlist.add(list2);

System.out.println(mainlist);
for(int i=0;i<mainlist.size();i++){
    ArrayList<Integer>currlist=mainlist.get(i);
    for(int j=0;j<currlist.size();j++){
    System.out.print(currlist.get(j)+" "); 
    }
    System.out.println();
}

}
public static void swap(ArrayList<Integer>listswap,int idx1,int idx2){

    int temp=listswap.get(idx1);
    listswap.set(idx1,listswap.get(idx2));
    listswap.set(idx2,temp);

}


   


}