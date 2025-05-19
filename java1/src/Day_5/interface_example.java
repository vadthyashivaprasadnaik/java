package Day_5;
interface I3{
	void add();
}
interface I4{
	void sub();
}
public class interface_example implements I3,I4{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Hello");
	}

	
	public static void main(String[] args) {
		interface_example t=new interface_example();
		t.add();
		t.sub();

	}

}
