package Day_8;

public class Runnable_fun_ex5 {

	public static void main(String[] args) {
		Runnable r1= new Runnable() {
			public void run() {
				System.out.println("Task one");
			}
		};

		Runnable r2= new Runnable() {
			public void run() {
				System.out.println("Task two");
			}
		};
		Thread t1= new Thread(r1);
		t1.start();
		Thread t2= new Thread(r2);
		t2.start();

	}

}
