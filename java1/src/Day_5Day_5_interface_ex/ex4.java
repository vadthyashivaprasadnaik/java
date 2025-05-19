package Day_5Day_5_interface_ex;
interface nrcm{
	void add();
}
interface nrcm1{
	void sub();
}
class NRCM11{
	
	public void NRCM1(){
		System.out.println("Narsimha Reddy Engineering College");
	}
}
class NRCM12 extends NRCM11 implements nrcm,nrcm1{
	public void add() {
	System.out.println("Hello Nrcm");
}
	public void sub() {
	System.out.println("Hi NRCM");
}
	public void NRCM3() {
		System.out.println("Hyderabad");
	}
}
public class ex4 {

	public static void main(String[] args) {

		NRCM12 n2=new NRCM12();
		n2.add();
		n2.sub();
		n2.NRCM1();
		n2.NRCM3();

	}

}
