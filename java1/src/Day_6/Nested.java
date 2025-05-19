package Day_6;

public class Nested {
	void show() {
		System.out.println("Hi");
	}
	class Test{
		void print() {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		Nested n= new Nested();
		Nested.Test t =new Nested().new Test();
		n.show();
		t.print();
		

	}

}
