package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class DataFile {

	// Members
	ArrayList<String> directory;
	ArrayList<Integer> input;
	
	
	// Constructors
	public DataFile(String directory, String input) {
		this.directory = loadDirectory(directory);
		this.input = loadSampleInput(input);
	}
	
	
	// Getters
	public ArrayList<String> loadDirectory() {
		return directory;
	}
	public ArrayList<Integer> loadSampleInput() {
		return input;
	}
	
	
	// Functions
	static ArrayList<String> loadDirectory(String directory) {
		ArrayList<String> data = new ArrayList<String>();
		
		try {
			File obj = new File(directory);
			Scanner reader = new Scanner(obj);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				data.add(line);
				
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
			System.exit(0);
		}
		
		return data;
		
	}
	static ArrayList<Integer> loadSampleInput(String input) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		try {
			File obj = new File(input);
			Scanner reader = new Scanner(obj);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				StringTokenizer tokenizer = new StringTokenizer(line);
				while (tokenizer.hasMoreTokens()) {
					Integer s = Integer.parseInt(tokenizer.nextToken());
					data.add(s);
				}
				
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
			System.exit(0);
		}
		
		return data;
		
	}
	
}

