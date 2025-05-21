package Day_7;

public class thread_ex2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread_ex2 d1=new thread_ex2();
		Thread t1=new Thread(d1);
		t1.start();
		System.out.println(t1.getName());
		System.out.println(t1.getState());
		Thread t2=new Thread(d1);
		t2.start();
		System.out.println(t2.getName());
		System.out.println(t2.getState());

	}

}
