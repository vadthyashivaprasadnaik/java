package Day_3;
abstract class shiva1{
	abstract void display();
	abstract void show();
}

class abstract_class1 {
	public void display() {
		System.out.println("Java is a high-level, object-oriented programming language known for its portability across platforms using the Java Virtual Machine (JVM).\r\n"
				+ "It is widely used for building web, mobile, and enterprise applications due to its robustness and security features.\r\n"
				+ "Java follows a \"write once, run anywhere\" principle, making it a popular choice for cross-platform development.");
	}
	public void show() {
		System.out.println("I learned till 20 percent of java");
	}

	public static void main(String[] args) {
		abstract_class1 a=new abstract_class1(); 
		abstract_class1 a1=new abstract_class1(); 
		a.display();
		a1.show();

	}

}
