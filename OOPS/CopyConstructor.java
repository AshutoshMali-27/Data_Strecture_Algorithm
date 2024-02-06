public class CopyConstructor {
   

    public static void main(String args[]){

        Student s1=new Student();
        s1.name="Ashu";
        s1.Roll=13;
        s1.password="adasf";
        
        Student s2=new Student(s1);

        s2.password="sdgdgs";
    }
   
    
}


class Student{
    String name;
    int Roll;
    String password;

   Student (Student s1){
    this.name=s1.name;
    this.Roll=s1.Roll;

   }

   Student(){
    System.out.println("constructor is called");
   }
}