class Multilevel_Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Multilevel_Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("The puppy plays.");
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.play();  // Method of Puppy class
    }
}

