package Day_3;

abstract class shiva3{
	abstract void add();
	void mul() {
		System.out.println("How are you?");
	}
	void show() {
		System.out.println("How are you?");
	}
	static void div() {
		System.out.println("Did you ate lunch?");
		
	}
	static void mod() {
		System.out.println("Lets go out!!");
		
	}
}
class sample1 extends shiva3{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Hello");
	}
	void show1() {
		System.out.println("Bye!!");
	}
}
class abstract_class3 {
	public static void main(String[] args) {
		sample1 a=new sample1();
		a.add();
		a.show();
		a.mul();
		shiva2.div();
		shiva2.mod();
		a.show1();
	}

}
