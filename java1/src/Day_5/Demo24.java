package Day_5;



public class Demo24 {
	void add() {
		System.out.println("Hii");
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a, int b,double d1) {
		System.out.println(a+b-d1);
	}

	public static void main(String[] args) {//main method can be overloaded but not over ride.
		Demo24 d=new Demo24();
		d.add();
		d.add(5);
		d.add(5, 7);
		d.add(4, 6, 8.8);

	}

}
