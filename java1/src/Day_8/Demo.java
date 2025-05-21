package Day_8;

public class Demo extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(3500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Demo t=new Demo();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		t.start();
		

	}

}
