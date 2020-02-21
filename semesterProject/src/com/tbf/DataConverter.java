package com.tbf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

	public static void convertToXML(List<Persons> pers) {
		/**
		 * As the while-loop iterates through the file a Gson variable is created along
		 * with a string to hold in new entries that are then written to a json file
		 * using FileWriter method.
		 */
		FileWriter persWriterXML = null;
		for (Persons i : pers) {
			XStream personsXML = new XStream();
			String toXML = personsXML.toXML(i);
			try {
				persWriterXML = new FileWriter("data/Persons.xml");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				persWriterXML.write(toXML);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * Closing the FileWriter method and the inputFile that opened Persons.dat.
		 */
		try {
			persWriterXML.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	public static void convertToJson(List<Persons> pers) {
		FileWriter persWriter = null;
		for (Persons i : pers) {
			Gson personsG = new GsonBuilder().setPrettyPrinting().create();
			String toJson = personsG.toJson(i);
			try {
				persWriter = new FileWriter("data/Persons.json");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				persWriter.write(toJson);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			persWriter.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		List<Persons> persList = LoadNParse.parsePersonsFile();
		convertToXML(persList);
		
		
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
		FileWriter assetsWriterXML = null;
		try {
			assetsWriter = new FileWriter("data/Assets.json");
			assetsWriterXML = new FileWriter("data/Assets.XML");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		DepositAssets deposit = new DepositAssets();
		Stocks newStock = new Stocks();
		PrivateInvest newInv = new PrivateInvest();

		/**
		 * The while-loop goes iterates through each line, tokenizes each component in
		 * a line then checks which type of asset type is being dealt with. Depending on
		 * the asset type, the correct set of variables are passed on to the class
		 * object. Gson type variable is created along with strings to convert each
		 * appropriate object variable into json format then write to file using
		 * FileWriter.
		 * 
		 */
		inputFile2.nextLine();
		while (inputFile2.hasNextLine()) {
			String line = inputFile2.nextLine();
			String tokens[] = line.split(";");
			if (tokens[1].contains("D")) {
				deposit = new DepositAssets(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]));
				XStream depositXML = new XStream();
				String toXMLD = depositXML.toXML(deposit);
				Gson depositG = new GsonBuilder().setPrettyPrinting().create();
				String toJsonD = depositG.toJson(deposit);
				try {
					assetsWriter.write(toJsonD);
					assetsWriterXML.write(toXMLD);
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (tokens[1].contains("S")) {
				newStock = new Stocks(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]),
						Double.parseDouble(tokens[4]), Double.parseDouble(tokens[5]), tokens[6],
						Double.parseDouble(tokens[7]));
				XStream stockXML = new XStream();
				String toXMLS = stockXML.toXML(newStock);
				Gson newStockG = new GsonBuilder().setPrettyPrinting().create();
				String toJsonS = newStockG.toJson(newStock);
				try {
					assetsWriter.write(toJsonS);
					assetsWriterXML.write(toXMLS);
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (tokens[1].contains("P")) {
				newInv = new PrivateInvest(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]),
						Double.parseDouble(tokens[4]), Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]));
				XStream invXML = new XStream();
				String toXMLI = invXML.toXML(newInv);
				Gson newInvG = new GsonBuilder().setPrettyPrinting().create();
				String toJsonG = newInvG.toJson(newInv);
				try {
					assetsWriter.write(toJsonG);
					assetsWriterXML.write(toXMLI);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		inputFile2.close();

		try {
			assetsWriter.close();
			assetsWriterXML.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
