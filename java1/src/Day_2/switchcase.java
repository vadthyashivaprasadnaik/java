package Day_2;
import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Color");
		String color=sc.next();		
		switch(color) {
		case "red":
			System.out.println("Celebrate holi");
			break;
		case"green":
			System.out.println("Celebrate Ramzan");
			break;
		case"white":
			System.out.println("Celebrate Christmas");
			break;
		case"orange":
			System.out.println("Celebrate Hanuman Jayanathi");
			break;
		default:
			System.out.println("No festival");
		}

	}

}
