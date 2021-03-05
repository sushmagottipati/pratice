package com.Practice.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FH {
	
	
		String path = "C:\\Users\\dell\\Desktop\\findword.txt";

		String[] arrayOfStrings = {"selenium","ui-automation","mobile-automation","APPIUM","UFT","loadRunner","Cucumber","TestNG"};

		static String findword="APPIUM";
		

		public void writeIntoFile() throws IOException {

			FileWriter fw = new FileWriter(path, true); 

			/* FileWriter fw = new FileWriter(path); */

			PrintWriter pw = new PrintWriter(fw);

			for (String string : arrayOfStrings) {

				fw.write(string);

				pw.println();

			}
			fw.close();	

			pw.close();

		}


		public void readFile(String word) throws IOException {

			FileReader fr = new FileReader(path);

			BufferedReader br = new BufferedReader(fr);

			String line;

			String[] wordsFromLine = null;

			boolean flag = false;

			
			// Reading the line Until the line not found
			while((line = br.readLine()) != null) {

				// split the line as words
				wordsFromLine = line.split(" ");

				// searching the given word in each line of words
				for (String wordToRead : wordsFromLine) {

					// comparing the given word to the line of words
					if (wordToRead.equalsIgnoreCase(word)) {				  

						flag = true;				  

						break;
					}		  

				}

			}

			if(flag==true)
				System.out.println(" The word " + word +" is available in the file.");
			else
				System.out.println(" The word " + word +" is NOT available in the file.");

			br.close();

			fr.close();

		}

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			FH fh = new FH();

			fh.writeIntoFile();

			fh.readFile(findword);
		}

	}





