package Day_6;

public class exception_handling_ex2 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);//int a=20;//exception
		int b=Integer.parseInt(args[1]);
		System.out.println("Hi");
		try {
			//int b=Integer.parseInt(args[1]);//exception
			int c=a/b;
			System.out.println(c);
		} catch(Exception e) {
			e.printStackTrace();//Sysout(.getmessage())//Sysout(.toString())
		}
		
	}

}
