package Day_7;
import java.util.Scanner;
import java.io.*;

public class day_7_ex3 {

	public static void main(String[] args) throws FileNotFoundException{
		File Obj = new File("C:\\Users\\V Shiva Prasad Naik\\OneDrive\\Desktop\\questions1.txt");
				Scanner Reader=new Scanner(Obj);
						while(Reader.hasNextLine()){
					String data=Reader.nextLine();
					System.out.println(data);
					//throw new FileNotFoundException("File kanipinchatle");
					}
						
					Reader.close();

					
	}
	

}
