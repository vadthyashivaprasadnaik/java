package Day_5;

class Test55{
	void add() {
		System.out.println("hi");
	}
}

public class Demo27 extends Test55{
	void add() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo27 d1=new Demo27();
		d1.add();

	}

}
