package Day_6;//most important 
class Demo{
	void show() {
		System.out.println("Hi");
	}
}
public class Unanimous_class_ex1 {
	Demo d1= new Demo() {//unanimous class
		void show() {
			System.out.println("Helloo");
			super.show();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unanimous_class_ex1 u= new Unanimous_class_ex1();
		u.d1.show();

	}

}
