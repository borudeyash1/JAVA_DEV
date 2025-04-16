class Single_Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Single_Animal {
    void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Method from Animal class
        dog.bark(); // Method from Dog class
    }
}

