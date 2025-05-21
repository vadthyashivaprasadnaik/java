package Day_7;

public class thread_ex3 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		thread_ex3 d1=new thread_ex3();
		Thread t1=new Thread(d1);
		t1.start();
		System.out.println("Hi");
		t1.sleep(1500);//here time is milliseconds
		System.out.println("Hello");
		
	}

}
