package Day_8;

public class Test1 extends Thread {
	public void run() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		Test1 t1= new Test1();
		System.out.println("Hello");
		t1.start();//here we didn't call run method but "Hi" is printed.
		//hence it is called Multi-Threading

	}

}
