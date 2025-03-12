class Parameterised {
    int id;
    String name;
    char sex;
    
    // Parameterized constructor
    Parameterised(int i, String n) {
        id = i;
        name = n;
        System.out.println("This is a Parameterised constructor");
    }
    Parameterised(int i, String n,char s) {
        id = i;
        name = n;
        sex = s;
        System.out.println("This is a Parameterised constructor with constructor overloading");
    }

    // Method to display the values
    void display() {
        System.out.println("ID \t Name \t Sex " );
        System.out.println( id +"\t"+ name +"\t"+ sex);
        
    }

    public static void main(String[] args) {
        // Creating an object of Parameterised class
        Parameterised p = new Parameterised(101, "John");
        Parameterised p2 = new Parameterised(104,"Aniket",'M');
        Parameterised p3 = new Parameterised(20,"Yash",'M');
        Parameterised p4 = new Parameterised(21,"Abhishek",'M');
        
        // Calling display method to print the values
        p.display();
        p2.display();
        p3.display();
        p4.display();
        
    }
}

