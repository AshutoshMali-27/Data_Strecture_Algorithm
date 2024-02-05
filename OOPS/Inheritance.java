public class Inheritance {
    
    public static void main(String args[]){

        Fish shark=new Fish();
        shark.eat();
        shark.Swim();
        shark.breaths(); 
        Dog dobby=new Dog();
        dobby.breaths();
        dobby.breaths();
        System.out.println(dobby.legs);

    }

}

class Animal{
    string color;
    
    void eat(){
        System.out.println("Eats Anything");
    }

    void breaths(){
        System.out.println("breaths");
    }

}

// class Fish extends Animal{
//     int fins;
//     void Swim(){
//         System.out.println("Swim");
//     }

class Mammals extends Animal{
    int legs;
    void eat(){
        System.out.println("eat grass");
    }
}

class Dog extends Animal{

}


abstract class Peigon{
void eat(){
    System.out.println("peigion eat");

}
abstract void walk();
}

class Horse extends peigon{
    void walk(){
        System.out.println("walk on four leg");
    }
}

class Chicken extends peigon{
    void walk(){
        System.out.println("walk on two legs");
    }
}




