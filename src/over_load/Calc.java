package over_load;

public class Calc {

	Calc() {
			System.out.println("calc called");
	}
	Calc(int x) {
		System.out.println("calc called : one param");
	}
	Calc(int x,int y) {
		System.out.println("calc called : two param");
	}
	

	int mySum(int x, int y) {

		return x + y;
	}

	void mySum(int x, int y, int z) {

	}

	void mySum(double x, double y) {

	}

	void mySum(double x, int y) {

	}

	void mySum(int x, double y) {

	}
}
