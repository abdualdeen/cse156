import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GameReport {
	public static void main(String args[]) {
		if (args.length > 0) {
			try {
				Scanner fileGiven = new Scanner(new File(args[0]));
				List<Game> gameList = new ArrayList<>();
				HashMap<String, HashSet<String>> pubGameMap = new HashMap<String, HashSet<String>>();
				HashSet<String> pubGameSet = new HashSet<String>();
				HashMap<String, HashSet<String>> gamePlatMap = new HashMap<String, HashSet<String>>();
				HashSet<String> gamePlatSet = new HashSet<String>();
				while (fileGiven.hasNextLine()) {
					Game g = null;
					String tokens[] = fileGiven.nextLine().split(",", -1);
					String name = tokens[0];
					String pub = tokens[1];
					String year = tokens[2];
					String plat = tokens[3];
					g = new Game(name, pub, year, plat);
					gameList.add(g);
					pubGameSet.add(tokens[0]);
					pubGameMap.put(tokens[1], pubGameSet);
					System.out.println(pubGameMap);
//					gamePlatSet.add(plat);
//					gamePlatMap.putIfAbsent(name, gamePlatSet);
//					System.out.println(pubGameMap);
				}
				fileGiven.close();
				//Printing the publisher game count.
				System.out.println("Publisher Game Count");
				System.out.println("======================");
				
//				for (Game pub : gameList) {
//					if (pub.getPub() != null || pub.getPub() != "") {
//						System.out.println(pub.getPub());
//					} 
//				}
				//Printing the game platform count.
				System.out.println("Game Platform Count");
				System.out.println("======================");
//				for (Game name : gameList) {
//					if (name.getgName().length() >= 1) {
//						System.out.println(name.getgName());
//					}
//				}
			} catch (FileNotFoundException e) {
				System.out.println("Input not found.");
			}
		}
	}

}
