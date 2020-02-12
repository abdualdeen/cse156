package com.tbf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.*;
import com.thoughtworks.xstream.*;

/**
 * 
 * DataConverter iterates through the Persons and the Assets file. It uses the
 * different classes to sort the data then writers out that data into json
 * files.
 *
 */
public class DataConverter {

	public static void main(String[] args) {
		/**
		 * Opening the target file and initializing required variables.
		 * 
		 * @param inputFile
		 */
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new File("data/Persons.dat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Persons persons = new Persons();
		FileWriter persWriter = null;
		FileWriter persWriterXML = null;
		try {
			persWriter = new FileWriter("data/Persons.json");
			persWriterXML = new FileWriter("data/Persons.xml");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		/**
		 * The while-loop iterates through each line in the persons file and splits the
		 * content into @param tokens. The appropriate fields are then split further
		 * (such as @param name field into first and last name). An if-else statement in
		 * the while-loop checks for lines that may not have any email addresses listed,
		 * this is done by checking if the token length is shorter than expected (in
		 * this case, its if the length is 4), the conditional then passes the
		 * appropriate constructor.
		 */
		inputFile.nextLine();
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			String tokens[] = line.split(";");
			String name[] = tokens[2].split(",");
			Name newName = new Name(name[1], name[0]);
			if (tokens.length == 4) {
				persons = new Persons(tokens[0], tokens[1], newName, tokens[2]);

			} else {
				ArrayList<String> newEmail = new ArrayList<>();
				newEmail.add(tokens[4]);
				persons = new Persons(tokens[0], tokens[1], newName, tokens[2], newEmail);
			}

			/**
			 * As the while-loop iterates through the file a Gson variable is created along
			 * with a string to hold in new entries that are then written to a json file
			 * using FileWriter method.
			 */
			XStream personsXML = new XStream();
			String toXML = personsXML.toXML(persons);
			Gson personsG = new GsonBuilder().setPrettyPrinting().create();
			String toJson = personsG.toJson(persons);
			try {
				persWriter.write(toJson);
				persWriterXML.write(toXML);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * Closing the FileWriter method and the inputFile that opened Persons.dat.
		 */
		try {
			persWriter.close();
			persWriterXML.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		inputFile.close();

		/**
		 * Opening the Assets.dat file and initializing some variables.
		 */
		Scanner inputFile2 = null;
		try {
			inputFile2 = new Scanner(new File("data/Assets.dat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		FileWriter assetsWriter = null;
		try {
			assetsWriter = new FileWriter("data/Assets.json");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		DepositAssets deposit = new DepositAssets();
		Stocks newStock = new Stocks();
		PrivateInvest newInv = new PrivateInvest();

		/**
		 * The while-loop goes iterates through each line, tokensizes each component in
		 * a line then checks which type of asset type is being dealt with. Depending on
		 * the asset type, the correct set of variables are passed on to the class
		 * object. Gson type variable is created along with strings to convert each
		 * appropriate object variable into json format then write to file using FileWriter.
		 * 
		 */
		inputFile2.nextLine();
		while (inputFile2.hasNextLine()) {
			String line = inputFile2.nextLine();
			String tokens[] = line.split(";");
			if (tokens[1].contains("D")) {
				deposit = new DepositAssets(tokens[0], tokens[1], tokens[2], tokens[3]);
				Gson depositG = new GsonBuilder().setPrettyPrinting().create();
				String toJsonD = depositG.toJson(deposit);
				try {
					assetsWriter.write(toJsonD);
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (tokens[1].contains("S")) {
				newStock = new Stocks(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], tokens[7]);
				Gson newStockG = new GsonBuilder().setPrettyPrinting().create();
				String toJsonS = newStockG.toJson(newStock);
				try {
					assetsWriter.write(toJsonS);
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (tokens[1].contains("P")) {
				newInv = new PrivateInvest(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
				Gson newInvG = new GsonBuilder().setPrettyPrinting().create();
				String toJsonG = newInvG.toJson(newInv);
				try {
					assetsWriter.write(toJsonG);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		inputFile2.close();

		try {
			assetsWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
