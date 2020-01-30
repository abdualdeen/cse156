import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameReport {
	public static void main(String args[]) {
		if (args.length > 0) {
			try {
				Scanner fileGiven = new Scanner(new File(args[0]));
				List<Game> gameList = new ArrayList<>();
				while (fileGiven.hasNextLine()) {
					Game g = null;
					String tokens[] = fileGiven.nextLine().split(",", -1);
//				System.out.println(tokens.length);
					String name = tokens[0];
					String pub = tokens[1];
					String year = tokens[2];
					String plat = tokens[3];
					g = new Game(name, pub, year, plat);
					gameList.add(g);
//				System.out.println(g.toString());
				}
				fileGiven.close();
				//Printing the publisher game count.
				System.out.println("Publisher Game Count");
				System.out.println("======================");
				
//				for (Game pub : gameList) {
//					if (pub.getPub() == null || pub.getPub() == "") {
//						
//					} else {
//						System.out.println(pub.getPub());
//					}
//
//				}
				//Printing the game platform count.
				System.out.println("Game Platform Count");
				System.out.println("======================");
				for (Game name : gameList) {
					if (name.getgName() == null || name.getgName() == "") {
						
					}else {
						System.out.println(name.getgName());
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("Input not found.");
			}
		}
	}

}
