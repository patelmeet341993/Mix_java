package inheritance;

public class Mychild extends Myparent  {

	int x=20;
	
	Mychild(){
		System.out.println("i am child");
	}
	
	void printX() {
		int x=30;
		System.out.println("local X : "+x);
		System.out.println("class X : "+this.x);
		System.out.println("parent X : "+super.x);
	}
}
