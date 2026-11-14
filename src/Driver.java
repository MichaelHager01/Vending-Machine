package application;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;


public class Driver {

	public static void main(String[] args) {

		// Load data from file
	    DataFile myData = new DataFile("directory.txt", "input.txt");
	    
	    // Initialize Vending machine with loaded data
	    ArrayList <String> myVending = myData.loadDirectory();
	    ArrayList <Integer> mySelections = myData.loadSampleInput();
	    
	    // Create objects for testing
	    Snack testAdd = new Snack("Chips", Float.valueOf(220), "Snack", Float.valueOf(4), false);
	    Vending myMachine = new Vending(myVending);
	    
//	    // Test if loadItems worked
//	    System.out.println("Items originally there:");
//	    myMachine.displayItems();
//	    System.out.println("______________________________");
//	    
//	    // Test if remove items works
//	    System.out.println("Items removed from list: ");
//	    myMachine.unloadItems(mySelections);
//	    myMachine.displayItems();
//	    System.out.println("______________________________");
//
//	    // Test if add items
//	    System.out.println("Items added by item: ");
//	    myMachine.addItem(testAdd);
//	    myMachine.displayItems();
//	    System.out.println("______________________________");
//	    
//	    // Test if add items
//	    System.out.println("Items added by index: ");
//	    myMachine.addItem(3);
//	    myMachine.displayItems();
//	    System.out.println("______________________________");
//	    
//	    // Testing limits with removing
//	    System.out.println("Items removed from row until empty: ");
//	    myMachine.unloadItem(0);
//	    myMachine.displayItems();	// Should remove from index 1
//	    myMachine.unloadItem(0);
//	    myMachine.displayItems();	// Should remove from index 0
//	    myMachine.unloadItem(0);
//	    myMachine.displayItems();	// Should output comment that row is already empty and return early
//	    System.out.println("______________________________");
	    
	    //Creating file for extra credit
	    try {
	    	FileWriter cout = new FileWriter("results.txt");
	    	
	    	// Test if loadItems worked
	    	cout.write("Items originally there: \n");
	    	String s1 = "";
			for (Integer i = 0; i < myMachine.directory.size(); i++) {
				if (myMachine.slots.get(i).size() == 0) {
					s1 += myMachine.directory.get(i) + ": (Drink/Snack): 0\n";
				}
				else {
				s1 += myMachine.directory.get(i) + ": (" + myMachine.slots.get(i).get(0).getItemType() + "): " + myMachine.slots.get(i).size() + "\n";
				}
			}
			cout.write(s1);
			cout.write("______________________________\n");
			
			
			// Test if remove items works
			cout.write("Items removed from list: \n");
		    myMachine.unloadItems(mySelections);
		    String s2 = "";
			for (Integer i = 0; i < myMachine.directory.size(); i++) {
				if (myMachine.slots.get(i).size() == 0) {
					s2 += myMachine.directory.get(i) + ": (Drink/Snack): 0\n";
				}
				else {
				s2 += myMachine.directory.get(i) + ": (" + myMachine.slots.get(i).get(0).getItemType() + "): " + myMachine.slots.get(i).size() + "\n";
				}
			}
			cout.write(s2);
		    cout.write("______________________________\n");

		    // Test if add items
		    cout.write("Items added by item: \n");
		    myMachine.addItem(testAdd);
		    String s3 = "";
			for (Integer i = 0; i < myMachine.directory.size(); i++) {
				if (myMachine.slots.get(i).size() == 0) {
					s3 += myMachine.directory.get(i) + ": (Drink/Snack): 0\n";
				}
				else {
				s3 += myMachine.directory.get(i) + ": (" + myMachine.slots.get(i).get(0).getItemType() + "): " + myMachine.slots.get(i).size() + "\n";
				}
			}
			cout.write(s3);
		    cout.write("______________________________\n");
		    
		    // Test if add items
		    cout.write("Items added by index: \n");
		    myMachine.addItem(3);
		    String s4 = "";
			for (Integer i = 0; i < myMachine.directory.size(); i++) {
				if (myMachine.slots.get(i).size() == 0) {
					s4 += myMachine.directory.get(i) + ": (Drink/Snack): 0\n";
				}
				else {
				s4 += myMachine.directory.get(i) + ": (" + myMachine.slots.get(i).get(0).getItemType() + "): " + myMachine.slots.get(i).size() + "\n";
				}
			}
			cout.write(s4);
		    cout.write("______________________________\n");
		    
		    // Testing limits with removing
		    cout.write("Items removed from row until empty: \n");
		    myMachine.unloadItem(0);
		    String s5 = "";
			for (Integer i = 0; i < myMachine.directory.size(); i++) {
				if (myMachine.slots.get(i).size() == 0) {
					s5 += myMachine.directory.get(i) + ": (Drink/Snack): 0\n";
				}
				else {
				s5 += myMachine.directory.get(i) + ": (" + myMachine.slots.get(i).get(0).getItemType() + "): " + myMachine.slots.get(i).size() + "\n";
				}
			}	// Should remove from index 1
			cout.write(s5);
		    myMachine.unloadItem(0);
		    String s6 = "";
			for (Integer i = 0; i < myMachine.directory.size(); i++) {
				if (myMachine.slots.get(i).size() == 0) {
					s6 += myMachine.directory.get(i) + ": (Drink/Snack): 0\n";
				}
				else {
				s6 += myMachine.directory.get(i) + ": (" + myMachine.slots.get(i).get(0).getItemType() + "): " + myMachine.slots.get(i).size() + "\n";
				}
			}	// Should remove from index 0
			cout.write(s6);
		    myMachine.unloadItem(0);
		    String s7 = "";
			for (Integer i = 0; i < myMachine.directory.size(); i++) {
				if (myMachine.slots.get(i).size() == 0) {
					s7 += myMachine.directory.get(i) + ": (Drink/Snack): 0\n";
				}
				else {
				s7 += myMachine.directory.get(i) + ": (" + myMachine.slots.get(i).get(0).getItemType() + "): " + myMachine.slots.get(i).size() + "\n";
				}
			}	// Should output comment that row is already empty and return early
			cout.write(s7);
		    cout.write("______________________________\n");
			
			
			
	    	cout.close();
	    }
	    catch (IOException e) {
	    	System.out.println("Error occured with writing new file.");
	    	e.printStackTrace();
	    }
	    
	}

}

