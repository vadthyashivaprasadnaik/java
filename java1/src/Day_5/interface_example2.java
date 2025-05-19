package Day_5;


interface I9{
	void add();
}
class Romeo{
	void sub() {
		System.out.println("Hello");
	}
}

public class interface_example2 extends Romeo implements I9{
	public void add() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		interface_example2 y=new interface_example2();
		y.add();
		y.sub();

	}

}
