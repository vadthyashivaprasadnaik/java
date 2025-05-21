package Day_8;

public class Demo2 extends Thread{

	public void run() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new Demo2());
		t1.start();
		//Daemon is a background work --->when true it works.

	}

}
