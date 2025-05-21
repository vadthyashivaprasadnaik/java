package Exception_Handling;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {44,77,88,99};
		int a= Integer.parseInt(args[0]);
		try {
			System.out.println(arr[a]);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}