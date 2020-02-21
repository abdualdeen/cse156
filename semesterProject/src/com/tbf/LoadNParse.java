package com.tbf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;

public class LoadNParse {
	public static List<Persons> parsePersonsFile() {
		List<Persons> personList = new ArrayList<Persons>();
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new File("data/Persons.dat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Persons persons = new Persons();
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
			personList.add(persons);
		}
		inputFile.close();
		return personList;
	}
	
	
	public static List<Assets> parseDataFile() {
		List<Assets> assList = new ArrayList<Assets>();
		
		Scanner inputFile2 = null;
		try {
			inputFile2 = new Scanner(new File("data/Assets.dat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		DepositAssets deposit = new DepositAssets();
		Stocks newStock = new Stocks();
		PrivateInvest newInv = new PrivateInvest();
		
		
		inputFile2.nextLine();
		while (inputFile2.hasNextLine()) {
			String line = inputFile2.nextLine();
			String tokens[] = line.split(";");
			if (tokens[1].contains("D")) {
				deposit = new DepositAssets(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]));
			
			} else if (tokens[1].contains("S")) {
				newStock = new Stocks(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]),
						Double.parseDouble(tokens[4]), Double.parseDouble(tokens[5]), tokens[6],
						Double.parseDouble(tokens[7]));

			} else if (tokens[1].contains("P")) {
				newInv = new PrivateInvest(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]),
						Double.parseDouble(tokens[4]), Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]));

			}
			assList.add(deposit);
			assList.add(newStock);
			assList.add(newInv);
		}
		
		inputFile2.close();
		return assList;

	}

}
