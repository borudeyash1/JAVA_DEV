class Overloading{
void add(){
System.out.println("This is a normal constructor");
}
void add(int a,int b){

  System.out.println (a+b);

}
void add(double a,double b){
  System.out.println(a+b);
}



public static void main(String[] args){
	Overloading obj = new Overloading();
	obj.add();
	obj.add(7,3);
	obj.add(1.1,9.0);
	
	
}
}
