package Day_5;

class Animal{
	public void sleep() {
		System.out.println("Sleeping!! ");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking!! ");
	}
}

public class Demo20 {//single inheritance

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();
		d1.sleep();
		
	}

}
