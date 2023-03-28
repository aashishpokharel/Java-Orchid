package classwork;

import java.io.FileWriter;

public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter Writer = new FileWriter("newfile22.txt");
			Writer.write("Files added as below");
			Writer.close();
			System.out.println("Write Successful");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
