package Day_3;

abstract class shiva{
	abstract void add();
	abstract void sum();
}

class abstract_class extends shiva{
	public void add() {System.out.println("hi");}
	public void sum() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		abstract_class a = new abstract_class();
		abstract_class a1 = new abstract_class();
		
		a.add();
		a1.sum();
			
	}
}
