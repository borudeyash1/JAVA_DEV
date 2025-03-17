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

class Single extends Parent {
    void acceptSingleInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Single Inheritance Information");
        System.out.print("Enter your single name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your single age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.println("Single Name: " + name);
        System.out.println("Single Age: " + age);
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

class Multiple implements First, Second {
    public void methodOne() {
        System.out.println("Method from First Interface");
    }

    public void methodTwo() {
        System.out.println("Method from Second Interface");
    }
}

interface First {
    void methodOne();
}

interface Second {
    void methodTwo();
}

class MultiLevelChild extends Child {
    void acceptMultiLevelChildInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multi-level Child Information");
        System.out.print("Enter multi-level child's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter multi-level child's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.println("Multi-level Child Name: " + name);
        System.out.println("Multi-level Child Age: " + age);
    }
}

class HierarchicalChild1 extends Parent {
    void acceptChild1Info() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hierarchical Child 1 Information");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.println("Child 1 Name: " + name);
        System.out.println("Child 1 Age: " + age);
    }
}

class HierarchicalChild2 extends Parent {
    void acceptChild2Info() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hierarchical Child 2 Information");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.println("Child 2 Name: " + name);
        System.out.println("Child 2 Age: " + age);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance (Using interfaces)");
            System.out.println("3. Multi-level Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case 1:
                    Single singleObj = new Single();
                    singleObj.acceptParentInfo();
                    singleObj.acceptSingleInfo();
                    break;
                case 2:
                    Multiple multipleObj = new Multiple();
                    multipleObj.methodOne();
                    multipleObj.methodTwo();
                    break;
                case 3:
                    MultiLevelChild multiLevelChildObj = new MultiLevelChild();
                    multiLevelChildObj.acceptParentInfo();
                    multiLevelChildObj.acceptChildInfo();
                    multiLevelChildObj.acceptMultiLevelChildInfo();
                    break;
                case 4:
                    HierarchicalChild1 child1Obj = new HierarchicalChild1();
                    child1Obj.acceptParentInfo();
                    child1Obj.acceptChild1Info();
                    HierarchicalChild2 child2Obj = new HierarchicalChild2();
                    child2Obj.acceptParentInfo();
                    child2Obj.acceptChild2Info();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }
}

