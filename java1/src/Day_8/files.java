package Day_8;
import java.io.*;
public class files {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\V Shiva Prasad Naik\\OneDrive\\Desktop\\sem.txt");
		if(f1.createNewFile()) {
			System.out.println("File is created!!");
		}else {
			System.out.println("File is not created!!");
		}

	}

}
