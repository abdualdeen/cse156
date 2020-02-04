import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class GameReport {
	/**
	 * Abdullah Hamad
	 * @param args
	 */
	public static void main(String args[]) {
		/**
		 * Checking if there are any arguments available to process. 
		 */
		if (args.length > 0) {
			try {
				//use Scanner method to store a file into a variable. 
				Scanner fileGiven = new Scanner(new File(args[0]));
				HashMap<String, HashSet<String>> pubGameMap = new HashMap<String, HashSet<String>>();
				HashMap<String, HashSet<String>> gamePlatMap = new HashMap<String, HashSet<String>>();
				/**
				 * Iterating through each file line and splitting the various components wanted by ',' 
				 * Components are game name, publisher, year of release, and platform the game was released to. 
				 * The components wanted are then 
				 */
				while (fileGiven.hasNextLine()) {
					String tokens[] = fileGiven.nextLine().split(",", -1);
					String name = tokens[0];
					String pub = tokens[1];
					String year = tokens[2];
					String plat = tokens[3];
					/**
					 * pubGameMap (HashMap that maps publisher to their games) checks if the publisher given already exists. 
					 * if so, it will add the new games to that existing publisher.
					 * if not, it will create a new HashSet to store temporarily the game to the new publisher then adds those values to the pubGameMap.
					 * The same action is done for the gamePlatMap (HashMap that maps game name to their platform. 
					 */
					if (pubGameMap.keySet().contains(pub)) {
						pubGameMap.get(pub).add(name);
					} else {
						HashSet<String> newGameSet = new HashSet<>();
						newGameSet.add(name);
						pubGameMap.put(pub, newGameSet);
					}
					
					if (gamePlatMap.keySet().contains(name)) {
						gamePlatMap.get(name).add(plat);
					} else {
						HashSet<String> newPlatSet = new HashSet<>();
						newPlatSet.add(plat);
						gamePlatMap.put(name, newPlatSet);
					}
				}
				fileGiven.close();
				/**
				 * The list of the publishers in pubGameMap is added to an ArrayList and sorted. 
				 * The publishers along with their game count is then printed. 
				 */
				List<String> arrayPubSet = new ArrayList<>(); 
				for (Entry <String, HashSet<String>> tempEntryPub : pubGameMap.entrySet()) {
					arrayPubSet.add(tempEntryPub.getKey());
				}
				Collections.sort(arrayPubSet);
				//Printing Publisher Game Count
				System.out.println("Publisher Game Count");
				System.out.println("======================");
				for (String b : arrayPubSet) {
					if (pubGameMap.get(b).size() < 1){
						System.out.println(b + "		" + "0");
					} else {
						System.out.println(b + "		" + pubGameMap.get(b).size());
					}
					
				}
				/**
				 * The list of games along with their platform count is printed. 
				 */
				List<String> arrayPlatSet = new ArrayList<>();
				for (Entry <String, HashSet<String>> tempEntryPlat : gamePlatMap.entrySet()) {
					arrayPlatSet.add(tempEntryPlat.getKey());
				}
				Collections.sort(arrayPlatSet);
				
				//Printing Game Platform Count
				System.out.println("Game Platform Count");
				System.out.println("======================");
				for (String a : arrayPlatSet) {
					if (gamePlatMap.get(a).size() <= 1){
						System.out.println(a + "		" + "0");
					} else {
						System.out.println(a + "		" + gamePlatMap.get(a).size());
					}
					
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("Input not found.");
			}
		}
	}

}
