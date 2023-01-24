package oops;

public class abstraction {
    public static void main(String[] args) {

        
        Horse h = new Horse();
        h.eat();
        h.walk(); 
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
    }
}

abstract class Animal{
    String color;
    // constructor 
    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changeColor(){
        color = "black";
    }
}

class chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }

    void changeColor(){
        color = "yellow";
    }

}