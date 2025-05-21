package Day_7;

public class thread_ex1 extends Thread{

	public static void main(String[] args) {
		thread_ex1 t1= new thread_ex1();
		thread_ex1 t2= new thread_ex1();
		thread_ex1 t3= new thread_ex1();
		thread_ex1 t4= new thread_ex1();
		thread_ex1 t5= new thread_ex1();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		System.out.println(t5.getName());
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
		System.out.println(t5.getState());
		
		//new--> creates;ready-->start(); create-->run;died
	}

}
