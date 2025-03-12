class A{
void display(){
System.out.println("Parent Class");
}
}
class B extends A{
void display()
{
super.display();
}

}



class Overriding{
public static void main(String[] args){
	B baby = new B();
	baby.display();
}
}
