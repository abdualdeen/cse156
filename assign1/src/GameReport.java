import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameReport {
	public static void main(String args[]) {
		try {
			Scanner fileGiven = new Scanner(new File(args[0]));
			while (fileGiven.hasNextLine()) {
				String 
			}
			fileGiven.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Input not found.");
		}
	}

}
