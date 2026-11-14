package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;


public class SampleController {
	
	@FXML
	private Button one;
	@FXML
	private Button two;
	@FXML
	private Button three;
	@FXML
	private Button four;
	@FXML
	private Button five;
	@FXML
	private Button six;
	@FXML
	private Button seven;
	@FXML
	private Button eight;
	
	
	// Load data from file
    DataFile myData = new DataFile("directory.txt", "input.txt");
    
    // Initialize Vending machine with loaded data
    ArrayList <String> myVending = myData.loadDirectory();
    
    Vending vendingMachine = new Vending(myVending);
	
	
	
	// Doing stuff to fill vending machine
	public void data() {
	    
	    Integer j = vendingMachine.directory.size();
	    Integer i = 0;
	    
	    ArrayList<Button> b = new ArrayList<Button>();
	    b.add(one);
	    b.add(two);
	    b.add(three);
	    b.add(four);
	    b.add(five);
	    b.add(six);
	    b.add(seven);
	    b.add(eight);
	    
	    for (Button button : b) {
	    	if (i == j) {
	    		break;
	    	}
	    	button.setText(vendingMachine.slots.get(i).get(0).getName() + "\nCount: " + vendingMachine.slots.get(i).size());
	    	i++;
	    }
	    
	}
	

	// Buttons clicked functions
    public void load_clicked() {
    	data();
    }
	
	public void one_clicked() {
		if (vendingMachine.slots.size() < 1) {
			return;
		}
		if (vendingMachine.slots.get(0).size() > 1) {
			vendingMachine.slots.get(0).remove(0);
			one.setText(vendingMachine.slots.get(0).get(0).getName() + "\nCount: " + vendingMachine.slots.get(0).size());
		}
		else if (vendingMachine.slots.get(0).size() == 1) {
			vendingMachine.slots.get(0).remove(0);
			one.setText("Empty");
		}
	}
	
	public void two_clicked() {
		if (vendingMachine.slots.size() < 2) {
			return;
		}
		if (vendingMachine.slots.get(1).size() > 1) {
			vendingMachine.slots.get(1).remove(0);
			two.setText(vendingMachine.slots.get(1).get(0).getName() + "\nCount: " + vendingMachine.slots.get(1).size());
		}
		else if (vendingMachine.slots.get(1).size() == 1) {
			vendingMachine.slots.get(1).remove(0);
			two.setText("Empty");
		}
	}
	
	public void three_clicked() {
		if (vendingMachine.slots.size() < 3) {
			return;
		}
		if (vendingMachine.slots.get(2).size() > 1) {
			vendingMachine.slots.get(2).remove(0);
			three.setText(vendingMachine.slots.get(2).get(0).getName() + "\nCount: " + vendingMachine.slots.get(2).size());
		}
		else if (vendingMachine.slots.get(2).size() == 1) {
			vendingMachine.slots.get(2).remove(0);
			three.setText("Empty");
		}
	}
	
	public void four_clicked() {
		if (vendingMachine.slots.size() < 4) {
			return;
		}
		if (vendingMachine.slots.get(3).size() > 1) {
			vendingMachine.slots.get(3).remove(0);
			four.setText(vendingMachine.slots.get(3).get(0).getName() + "\nCount: " + vendingMachine.slots.get(3).size());
		}
		else if (vendingMachine.slots.get(3).size() == 1) {
			vendingMachine.slots.get(3).remove(0);
			four.setText("Empty");
		}
	}
	
	public void five_clicked() {
		if (vendingMachine.slots.size() < 5) {
			return;
		}
		if (vendingMachine.slots.get(4).size() > 1) {
			vendingMachine.slots.get(4).remove(0);
			five.setText(vendingMachine.slots.get(4).get(0).getName() + "\nCount: " + vendingMachine.slots.get(4).size());
		}
		else if (vendingMachine.slots.get(4).size() == 1) {
			vendingMachine.slots.get(4).remove(0);
			five.setText("Empty");
		}
	}
	
	public void six_clicked() {
		if (vendingMachine.slots.size() < 6) {
			return;
		}
		if (vendingMachine.slots.get(5).size() > 1) {
			vendingMachine.slots.get(5).remove(0);
			six.setText(vendingMachine.slots.get(5).get(0).getName() + "\nCount: " + vendingMachine.slots.get(5).size());
		}
		else if (vendingMachine.slots.get(5).size() == 1) {
			vendingMachine.slots.get(5).remove(0);
			six.setText("Empty");
		}
	}
	
	public void seven_clicked() {
		if (vendingMachine.slots.size() < 7) {
			return;
		}
		if (vendingMachine.slots.get(6).size() > 1) {
			vendingMachine.slots.get(6).remove(0);
			seven.setText(vendingMachine.slots.get(6).get(0).getName() + "\nCount: " + vendingMachine.slots.get(6).size());
		}
		else if (vendingMachine.slots.get(6).size() == 1) {
			vendingMachine.slots.get(6).remove(0);
			seven.setText("Empty");
		}
	}
	
	public void eight_clicked() {
		if (vendingMachine.slots.size() < 8) {
			return;
		}
		if (vendingMachine.slots.get(7).size() > 1) {
			vendingMachine.slots.get(7).remove(0);
			eight.setText(vendingMachine.slots.get(7).get(0).getName() + "\nCount: " + vendingMachine.slots.get(7).size());
		}
		else if (vendingMachine.slots.get(7).size() == 1) {
			vendingMachine.slots.get(7).remove(0);
			eight.setText("Empty");
		}
	}
	
}
