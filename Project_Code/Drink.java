package application;


public class Drink extends Item {

	// Members
	Float ounces;
	String type;
	
	
	// Constructors
	public Drink(String name, Float calories, String itemType, Float ounces, String type) {
		super(name, calories, itemType);
		this.ounces = ounces;
		this.type = type;
	}
	public Drink(Float ounces, String type) {
		super();
		this.ounces = ounces;
		this.type = type;
	}
	public Drink() {
		super();
	}
	
	
	// Setters and Getters
	public Float getOunces() {
		return ounces;
	}
	public void setOunces(Float ounces) {
		this.ounces = ounces;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "Drink [ounces=" + ounces + ", type=" + type + ", name=" + name + ", calories=" + calories
				+ ", itemType=" + itemType + ", getOunces()=" + getOunces() + ", getType()=" + getType()
				+ ", getName()=" + getName() + ", getCalories()=" + getCalories() + ", getItemType()=" + getItemType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

