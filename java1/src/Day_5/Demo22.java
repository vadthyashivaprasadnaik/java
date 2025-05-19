package Day_5;

class Fruits{
	void benefits(){
		System.out.println("healthy ");
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("Red color ");
	}
}
class Mango extends Fruits{
	void price() {
		System.out.println("100/KG ");
	}
}
class Banana extends Fruits{
	void taste() {
		System.out.println("Sweet!! ");
	}
}

public class Demo22 {

	public static void main(String[] args) {
		 Apple a=new Apple();
		 Mango m=new Mango();
		 Banana b=new Banana();
		a.color();
		a.benefits();
		b.taste();
		b.benefits();
		m.price();
		m.benefits();

	}

}
