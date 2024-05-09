
import java.util.*;
public class OperationonAL {


public static void main(String args[]){

    ArrayList<Integer> List1 = new ArrayList<>();

    List1.add(2);
    List1.add(3);
    List1.add(4);
    List1.add(7);

    System.out.println(List1);

    int element=List1.get(2);
    System.out.println(element);

    List1.remove(2);
    System.out.println(List1);

    List1.set(2, 78);
    System.err.println(List1);


    System.out.println(List1.contains(78));
}


   


}