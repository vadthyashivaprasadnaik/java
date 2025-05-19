package Day_5;
interface I1{
	void add();
	void sub();
}

public class Test35 implements I1{
	public void add(){
		System.out.println("Hi");
		
	}
	public void sub(){
		System.out.println("Hello");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test35 t1=new Test35();
		t1.add();
		t1.sub();

	}

}
