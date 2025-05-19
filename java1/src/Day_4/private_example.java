package Day_4;
class demo14{
	private void add() {//private method. if we don't keep any thing its default.
		System.out.println("hi");
	}
}

public class private_example extends demo14 {

	public static void main(String[] args) {
		private_example t1=new private_example();
		//t1.add();// here we are trying to access but we will not get output cause there is private.
		// and also private is in another class. if private was in same class we will not get error
		
		

	}

}
