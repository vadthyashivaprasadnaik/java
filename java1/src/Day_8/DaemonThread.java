package Day_8;

public class DaemonThread extends Thread{
	String s;
	public DaemonThread(String name) {
		s=name;
	}
	public void run() {
		//checking whether thread is daemon or not.
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s+"is Daemon Thread");
		}else {
			System.out.println(s+"User Thread");
		}
	}

	public static void main(String[] args) {
		DaemonThread thread1=new DaemonThread("Thread1");
		DaemonThread thread2=new DaemonThread("Thread2");
		DaemonThread thread3=new DaemonThread("Thread3");
		
		thread1.setDaemon(true);//set user thread to daemon
		
		thread1.start();//starting thread1
		thread2.start();//starting thread2
		
		thread3.setDaemon(false);//set user thread1 to daemon
		thread3.start();//starting thread3

		//Daemon is a background work --->when true it works.

	}

}
