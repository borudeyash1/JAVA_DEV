import java.util.*;

class Person  {
    String name;
    int age;

    void acceptPersonInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Person Information");
        System.out.print("Enter the person's name: ");
        name = scanner.nextLine();
        System.out.print("Enter the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine();  // consume the newline
    }

    void displayPersonInfo() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
    }
}

class Kid extends Person {
    String kidName;
    int kidAge;

    void acceptKidInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kid Information");
        System.out.print("Enter kid's name: ");
        kidName = scanner.nextLine();
        System.out.print("Enter kid's age: ");
        kidAge = scanner.nextInt();
        scanner.nextLine();  // consume the newline
    }

    void displayKidInfo() {
        System.out.println("Kid Name: " + kidName);
        System.out.println("Kid Age: " + kidAge);
    }
}

public class Inh_pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Enter Person and Kid Information");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    Kid kidObj = new Kid();  // Use Kid instead of Child
                    kidObj.acceptPersonInfo();   // Calling Person class method
                    kidObj.acceptKidInfo();     // Calling Kid class method
                    kidObj.displayPersonInfo(); // Display Person info
                    kidObj.displayKidInfo();    // Display Kid info
                    break;

                default:
                    System.out.println("Invalid choice! Exiting...");
                    break;
            }

        } while (choice == 1); // Exit after performing the option
    }
}

