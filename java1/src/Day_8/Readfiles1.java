package Day_8;
import java.io.*;
import java.util.Scanner;
public class Readfiles1 {

	public static void main(String[] args) {
		try {
			File Obj = new File("C:\\Users\\V Shiva Prasad Naik\\OneDrive\\Desktop\\sem.txt");
			Scanner R = new Scanner(Obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
			}
			R.close();
		}catch(FileNotFoundException e){
			System.out.println("An Error has occured.");
			e.printStackTrace();
		}

	}

}
