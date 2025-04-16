/*Abstract class- Abstract class can have both abstract and concrete methods.
interfacae-An interface is a reference type,similar to a class,that can contain only constants,method
 signatures,default methods,static methods adn nested types.Interface cannot contain instance fields or
constructors.*/
/*syntax:public interface Animal{
  void eat();
  void sleep();
}*/
/*Interfaces
Methods: Interfaces can declare abstract methods (without body) and default methods (with body).

Multiple Inheritance: A class can implement multiple interfaces, allowing for a form of multiple inheritance.

Fields: Fields in interfaces are implicitly public, static, and final (constants).

Constructors: Interfaces cannot have constructors.

Type of Inheritance: An interface represents a contract for what a class can do, without dictating how it should do it.*/
/*Abstract Classes
Methods: Abstract classes can have both abstract methods (without body) and concrete methods (with body).

Single Inheritance: A class can extend only one abstract class, as Java does not support multiple inheritance with classes.

Fields: Abstract classes can have instance variables (fields) with any access modifier.

Constructors: Abstract classes can have constructors, which can be used to initialize fields or perform setup actions.

Type of Inheritance: An abstract class represents an is-a relationship and can provide a common base class with shared code for subclasses.*/
//-----------------------------------------------------------------------------------------------------
abstract class BirdOfPrey {

    public abstract void hunt();  
    public void rest() {          
        System.out.println("Bird of prey is resting.");
    }
}

    

interface Bird {
    void fly();
}

class Multiple_Eagle extends BirdOfPrey implements Animal, Bird {
    
    public void hunt() {
        System.out.println("Eagle is hunting.");
    }


    public void eat() {
        System.out.println("Eagle is eating.");
    }

    // Implementing the method from Bird interface
    public void fly() {
        System.out.println("Eagle is flying.");
    }

    public static void main(String[] args) {
        Multiple_Eagle eagle = new Multiple_Eagle();
        eagle.hunt();  // Calling the abstract method from BirdOfPrey
        eagle.rest();  // Calling the concrete method from BirdOfPrey
        eagle.eat();   // Calling method from Animal interface
        eagle.fly();   // Calling method from Bird interface
    }
}

