package Day_8;

public class Runnable_fun_ex1 implements Runnable {
	public void run() {
		System.out.println("Hi");
	}


	public static void main(String[] args) {
		Runnable_fun_ex1 t1= new Runnable_fun_ex1();
		System.out.println("Hello");
		Thread t2=new Thread(t1);
		t2.start();

	}

}
