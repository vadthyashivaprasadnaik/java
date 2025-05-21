package Day_8;
import java.io.*;

public class files1 {

	public static void main(String[] args) throws IOException {
		FileWriter f1=new FileWriter("C:\\Users\\V Shiva Prasad Naik\\OneDrive\\Desktop\\sem.txt");
		f1.write("Hi Shiva How are you?");
		f1.close();
		System.out.println("Success");

	}

}
