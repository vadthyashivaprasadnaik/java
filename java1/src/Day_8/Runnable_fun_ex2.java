package Day_8;

public class Runnable_fun_ex2 implements Runnable{
	public void run() {
		System.out.println("Hi");
	}


	public static void main(String[] args) {
		Runnable_fun_ex2 t1= new Runnable_fun_ex2();
		Runnable_fun_ex2 t2= new Runnable_fun_ex2();
		
		System.out.println("Hello");
		
		Thread p1=new Thread(t1);
		Thread p2=new Thread(t2);
		
		p1.start();
		p2.start();
//for only 1 class we are creating two threads . so it doesn't consider how many objects u create. it considers
		//how many .start you gave for threads.
		//in one line -> starting of thread is important.
	}

}
