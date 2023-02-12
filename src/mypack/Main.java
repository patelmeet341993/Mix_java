package mypack;

public class Main {

	public static void main(String[] args) {
		
		Mycls m1=new Mycls();
		Mycls m2=new Mycls();
		Mycls m3=new Mycls();
		
		m1.x=10;
		m1.y=10;
		m1.z=10;
		
		m1.printVal();
		
		m2.x=20;
		m2.y=20;
		m2.z=20;
		
		
		
		m3.x=30;
		m3.y=30;
		m3.z=30;
		
		m2.printVal();
		m3.printVal();
		
		System.out.println("Z : "+Mycls.z);
			
	}

}
