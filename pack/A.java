package pack;

import java.util.*;





public class A {

    public void msg() {
    
        System.out.println("This is a package");
        
        }
        
        
        
    public void msg2() {
        
            System.out.println("This is another message");
            
            }
            
            
            
    public void msg3() {
        
            System.out.println("This is yet another message");
            
            } 
                
    public void circle(){
    
      //measuring are and perimeter of circle by user
        
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the radius of the circle");
                
      double r = sc.nextDouble();
      
          double area = 3.14*r*r;
          
              double perimeter = 2*3.14*r;
              
                  System.out.println("The area of the circle is "+area);
                  
                      System.out.println("The perimeter of the circle is "+perimeter);
                      
                                    
                                    
                                    
                                    
      }
                                                
      public void triangle(){
      
          //measuring area and perimeter of triangle by user
          
              Scanner sc = new Scanner(System.in);
              
        System.out.println("Enter the base of the triangle");
        
            double b = sc.nextDouble();
            
        
        System.out.println("Enter the height of the triangle");
        
            double h = sc.nextDouble();
            
                double area = 0.5*b*h;  
                
                    System.out.println("The area of triangle is: "+area);
                    
                    }
                    
                    
        public void cube(){
          Scanner sc = new Scanner(System.in);
              
        System.out.println("Enter the length of side of cude: ");
        
            double side = sc.nextDouble();
            double SAC = 6*(side*side);
            System.out.println("The surface area of the cube is: " +SAC);
            double  VolC = side * side * side;
            System.out.println("The surface area of the cube is: " +VolC);
            
        }
        
        public void cuboid(){
          Scanner sc = new Scanner(System.in);
              
        System.out.println("Enter the length of cudoid: ");
        
            double LOC = sc.nextDouble();
             System.out.println("Enter the breadth of cudoid: ");
        
            double BOC = sc.nextDouble();
             System.out.println("Enter the height of cudoid: ");
        
            double HOC = sc.nextDouble();
            double SACU = 2*((LOC*BOC)+(BOC*HOC)+(HOC*LOC));
            double  VolCU = LOC * BOC * HOC;
            System.out.println("The surface area of the cube is: " +SACU);
            System.out.println("The surface area of the cube is: " +VolCU);
            
        }
        
                    
                    
                    
                    
                    
      }
