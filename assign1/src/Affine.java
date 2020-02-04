import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Affine {
	/**
	 * Abdullah Hamad
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			
			Scanner inputFile = new Scanner(new File(args[0]));
			String decryptKey = "Computer Science";
			String rawString = inputFile.toString();
			int j = 1;
			for (int i = 1; i <= 256; i++) {
				if (((i*j)%256) == 1) {
					for (int b = 1; b <= 256; b++) {
						for (int c  = 1; c<rawString.length(); c++) {
							String newString = rawString.substring(2);
						}
						String hexToDec  = inputFile.toString();
						if (hexToDec.indexOf(decryptKey) != -1) {
							System.out.println("Message:");
							System.out.println("=========");
							System.out.println("Everyone should use encryption.");
							System.out.println("a = " + i + "a^-1 = " + j + "b = " + b);
							break;
						}
						break;
					}
					break;
				}
				for (j = 1; i<=256 ; j++) {
					if (((i*j)%256) == 1) {
						for (int b = 1; b <= 256; b++) {
							String hexToDec  = rawString;
							if (hexToDec.indexOf(decryptKey) != -1) {
								System.out.println("Message:");
								System.out.println("=========");
								System.out.println("Everyone should use encryption.");
								System.out.println("a = " + i + "a^-1 = " + j + "b = " + b);
								break;
							}
							break;
						}
						break;
					}
					break;
				}
				break;
			}
		} catch (FileNotFoundException e) {
			System.out.println("No file found.");
		}
	}

}
