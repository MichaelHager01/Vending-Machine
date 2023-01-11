package application;

import java.util.ArrayList;


public class Vending {

	// Members
	ArrayList<String> directory;
	ArrayList<ArrayList<Item>> slots;
	
	
	// Constructor
	public Vending(ArrayList<String> myVendings) {
		loadItem(myVendings);
	}
	
	
	// Functions
	void loadItem(ArrayList<String> myVendings) {
		ArrayList<String> newDirectory = new ArrayList<String>();
		ArrayList<ArrayList<Item>> slots = new ArrayList<ArrayList<Item>>();
		
		for (Integer i = 0; i < myVendings.size(); i++) {
			ArrayList<Item> row = new ArrayList<Item>();
			String str = myVendings.get(i);
			String[] arr = str.split(",");
			if (arr[0].equals("Drink")) {
				String name = arr[1].strip();
				Float calories = Float.valueOf(arr[2].strip());
				String itemType = arr[0].strip();
				Float ounces = Float.valueOf(arr[3].strip());
				String type = arr[4].strip();
				Drink newItem = new Drink(name, calories, itemType, ounces, type);
				newDirectory.add(arr[1].strip());
				for (Integer j = 0; j < Integer.valueOf(arr[5].strip()); j++) {
					row.add(newItem);
				}
				slots.add(row);
			}
			else if (arr[0].equals("Snack")) {
				String name = arr[1].strip();
				Float calories = Float.valueOf(arr[2].strip());
				String itemType = arr[0].strip();
				Float weight = Float.valueOf(arr[3].strip());
				Boolean containsNuts = Boolean.valueOf(arr[4]);
				Snack newItem = new Snack(name, calories, itemType, weight, containsNuts);
				newDirectory.add(arr[1].strip());
				for (Integer j = 0; j < Integer.valueOf(arr[5].strip()); j++) {
					row.add(newItem);
				}
				slots.add(row);
			}
			else {
				System.out.println("Incorrect item for vending machine.");
				System.exit(0);
			}
			
		}
		
		this.directory = newDirectory;
		this.slots = slots;
		
	}
	void addItem(Item newItem) {
		for (ArrayList<Item> check : this.slots) {
			if (check.size() != 0) {
				if (check.get(0).getName().equals(newItem.getName())) {
					check.add(newItem);
					return;
				}
			}
		}
		ArrayList<Item> newRow = new ArrayList<Item>();
		newRow.add(newItem);
		this.slots.add(newRow);

	}
	void addItem(Integer index) {
		if (this.slots.get(index).size() == 0) {
			System.out.println("Cant add item from index if row is empty.\n");
			return;
		}
		this.slots.get(index).add(this.slots.get(index).get(0));

	}
	void unloadItem(Integer index) {
		if (index < 0 || index > this.directory.size()) {
			System.out.println("Invalid Index.");
			System.exit(0);
		}
		String name = this.directory.get(index);
		if (this.slots.get(index).size() > 1) {
			this.slots.get(index).remove(0);
		}
		else if (this.slots.get(index).size() == 1) {
			Integer newIndex = index;
			for (Integer i = 0; i < slots.size(); i++) {
				ArrayList<Item> newRow = this.slots.get(i);
				if (newRow.size() > this.slots.get(newIndex).size() && newRow.get(0).name.equals(name)) {
					newIndex = i;
				}
			}
			this.slots.get(newIndex).remove(0);
		}
		else {
			System.out.println("Row is already empty.\n");
			return;
		}
		
	}
	void unloadItems(ArrayList<Integer> indexes) {
		for (Integer i : indexes) {
			unloadItem(i);
		}
		
	}
	ArrayList<Integer> findProduct(String item) {
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for (Integer i = 0; i < this.directory.size(); i++) {
			if (this.directory.get(i) == item) {
				indexes.add(i);
			}
		}
		return indexes;
		
	}
	public void displayItems() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		String s = "";
		for (Integer i = 0; i < directory.size(); i++) {
			if (slots.get(i).size() == 0) {
				s += directory.get(i) + ": (Drink/Snack): 0\n";
			}
			else {
			s += directory.get(i) + ": (" + slots.get(i).get(0).getItemType() + "): " + slots.get(i).size() + "\n";
			}
		}
		return s;
	}
	
}

