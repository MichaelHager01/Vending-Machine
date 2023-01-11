package application;
public class Snack extends Item {

	// Members
	Float weight;
	Boolean containsNuts;
	
	
	// Constructors
	public Snack(String name, Float calories, String itemType, Float weight, Boolean containsNuts) {
		super(name, calories, itemType);
		this.weight = weight;
		this.containsNuts = containsNuts;
	}
	public Snack(Float weight, Boolean containsNuts) {
		super();
		this.weight = weight;
		this.containsNuts = containsNuts;
	}
	public Snack() {
		super();
	}

	
	// Setters and Getters
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public Boolean getContainsNuts() {
		return containsNuts;
	}
	public void setContainsNuts(Boolean containsNuts) {
		this.containsNuts = containsNuts;
	}


	@Override
	public String toString() {
		return "Snack [weight=" + weight + ", containsNuts=" + containsNuts + ", name=" + name + ", calories="
				+ calories + ", itemType=" + itemType + ", getWeight()=" + getWeight() + ", getContainsNuts()="
				+ getContainsNuts() + ", getName()=" + getName() + ", getCalories()=" + getCalories()
				+ ", getItemType()=" + getItemType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

