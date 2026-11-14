package application;


public abstract class Item {

	// Members
	String name;
	Float calories;
	String itemType;
	

	// Constructors
	public Item(String name, Float calories, String itemType) {
		super();
		this.name = name;
		this.calories = calories;
		this.itemType = itemType;
	}
	public Item() {}
	
	
	// Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getCalories() {
		return calories;
	}
	public void setCalories(Float calories) {
		this.calories = calories;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}

