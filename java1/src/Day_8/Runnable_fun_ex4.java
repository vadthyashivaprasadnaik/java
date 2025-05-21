package Day_8;

class Test extends Thread{
	public void run1() {
		System.out.println("Hello");
	}
}
class Test4 extends Test{
	public void run2() {
		System.out.println("Hello");
	}
}
class Test5 implements Runnable{
	public void run() {
		System.out.println("Hi");
	}
	
}
class Test6 extends Test5{
	public void run3() {
		System.out.println("Hello");
	}
}

class Runnable_fun_ex4 {

	public static void main(String[] args) {
		Test4 t7= new Test4();
		t7.run1();//t7.start();
		t7.run2();//t7.start();
		
		Test5 t4=new Test5();
		Thread t3= new Thread(t4);
		t3.run();//t3.start();
		Test6 t5=new Test6();
		Thread t6= new Thread(t5);
		t6.run();//t6.start();
		t5.run3();

	}

}
