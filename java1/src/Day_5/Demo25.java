package Day_5;

public class Demo25 {
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
		//Demo25 d=new Demo25();
		//d.add();
		//d.add(5);
		//d.add(5, 7);
		//d.add(4, 6, 8.8);
		//main();//runtime poly morphism also called as overriding
		//a child class method change the implementation of the parent class method is called as method overriding

	}

}

