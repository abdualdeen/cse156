package com.tbf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataConverter {

	public static void main(String[] args) {

		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFile.nextLine();
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			String tokens[] = line.split(";");
			String name[] = tokens[2].split(",");
			Name newName = new Name(name[1], name[0]);
			if (tokens.length == 4) {
				Persons persons = new Persons(tokens[0], tokens[1], newName, tokens[2]);
				System.out.println(persons.getBrokerStatus());

			} else {
				ArrayList<String> newEmail = new ArrayList<>();
				newEmail.add(tokens[4]);
				Persons persons = new Persons(tokens[0], tokens[1], newName, tokens[2], newEmail);
				System.out.println(persons.getBrokerStatus());
			}
		}
		inputFile.close();

		Scanner inputFile2 = null;
		try {
			inputFile2 = new Scanner(new File(args[1]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputFile2.nextLine();
		while (inputFile2.hasNextLine()) {
			String line = inputFile2.nextLine();
			String tokens[] = line.split(";");
			if (tokens[1].contains("D")) {
				DepositAssets deposit = new DepositAssets(tokens[0], tokens[1], tokens[2], tokens[3]);
				System.out.println(deposit.getCode());

			} else if (tokens[1].contains("S")) {
				Stocks newStock = new Stocks(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], tokens[7]);
				System.out.println(newStock.getCode());
				System.out.println(newStock.getQuartDivi());

			} else if (tokens[1].contains("P")) {
				PrivateInvest newInv = new PrivateInvest(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
				System.out.println(newInv.getCode());
			}
		}
		inputFile2.close();

	}

}
