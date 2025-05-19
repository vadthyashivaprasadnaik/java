package Day_5Day_5_interface_ex;
interface namo{
	void add();
	
}
interface namo1{
	void sub();
}
interface namo2 extends namo,namo1{
	void mul();
	
	
}
public class ex1 implements namo2{
	public void add() {
		System.out.println("add Bharat");
	}
	public void sub() {
		System.out.println("Substract Pakistan");
	}
	public void mul() {
		System.out.println("Akhand Bharat");
	}
	

	public static void main(String[] args) {
		ex1 ex1 = new ex1();
		ex1.add();
		ex1.sub();
		ex1.mul();
		

	}

}
