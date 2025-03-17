import java.util.*;

class Parent {
    void acceptParentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parent Information");
        System.out.print("Enter the parent name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the parent age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.println("Parent Name: " + name);
        System.out.println("Parent Age: " + age);
    }
}

class Child extends Parent {  
    void acceptChildInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Child Information");
        System.out.print("Enter child's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter child's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.println("Child Name: " + name);
        System.out.println("Child Age: " + age);
    }
}

public class Inh_pr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Single Inheritance");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    Child childObj = new Child();  // Use Child instead of Single
                    childObj.acceptParentInfo();   // Calling parent class method
                    childObj.acceptChildInfo();    // Calling child class method
                    break;

                default:
                    System.out.println("Invalid choice! Exiting...");
                    break;
            }

        } while (choice == 1); // Exit after performing the option
    }
}

