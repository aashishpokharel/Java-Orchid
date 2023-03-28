package classwork;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File1 {
	public static void main(String[] args) {
		try {
			File Obj = new File("newfile22.txt");
			Scanner Reader = new Scanner(Obj);
//			if(Obj.createNewFile()) {
//				System.out.println("File Created : " + Obj.getName());
//			}
//			else {
//				SystemS.out.println("File Creation Failed");
//			}
			while(Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}catch(Exception e){
			System.out.print(e);
		}
	}
}
