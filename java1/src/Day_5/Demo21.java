package Day_5;

class Bike{
	void speed() {
		System.out.println("250 Km per Hour ");
	}
}

class Bmw extends Bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class model extends Bmw{
	void price() {
		System.out.println("just 30 lakhs");
	}
}
public class Demo21 {//multilevel inheritance

	public static void main(String[] args) {
	 model m=new model();
	 m.speed();
	 m.rev();
	 m.price();

	}

}
