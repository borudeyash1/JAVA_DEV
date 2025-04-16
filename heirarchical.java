class Heirarchical_Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Heirarchical_Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Heirarchical_Animal {
    void meow() {
        System.out.println("The cat meows.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Method of Dog class

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Method of Cat class
    }
}
 
