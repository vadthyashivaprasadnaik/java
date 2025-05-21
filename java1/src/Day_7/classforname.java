package Day_7;
import java.util.*;
public class classforname {
	

	public static void main(String[] args) {
		classforname s1= new classforname();
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Class Name");
			String className=sc.next();
			Class.forName(className);
			System.out.println("The class was found");
		}catch(ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}finally {
			sc.close();
		}

	}

}
