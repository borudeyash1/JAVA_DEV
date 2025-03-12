interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Multiple_Eagle implements Animal, Bird {
    public void eat() {
        System.out.println("Eagle is eating.");
    }
    
    public void fly() {
        System.out.println("Eagle is flying.");
    }
    
    public static void main(String[] args) {
        Multiple_Eagle eagle = new Multiple_Eagle();
        eagle.eat(); // Calling method from Animal interface
        eagle.fly(); // Calling method from Bird interface
    }
}

