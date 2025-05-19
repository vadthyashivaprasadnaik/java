package Day_2_assignment;
import java.util.*;

public class password_validation {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		String pass=myObj.nextLine();
		System.out.println(pass);
		if(pass.length()<8) {
			System.out.println("Invalid Password: must be at least 8 charecters");
			
		}else if(!Character.isUpperCase(pass.charAt(0))) {
			System.out.println("Invalid Password: must start with capital letter");
		}else {
			System.out.println("Valid Password");
		}
		}
	}

