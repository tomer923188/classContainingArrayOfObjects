
public class Snack {
	public String name;
	public double weight;
	public double price;
	public int rank;

//constructor
public Snack (String name, double weight, double price, int rank) {
	this.name = name;
	this.weight = weight;
	this.price = price;
	this.rank = rank;
}

//returns the name of the item
public String getName() {
	return name;
}

//returns the item's weight
public double getWeight() {
	return weight;
}

//returns the item's price
public double getPrice() {
	return price;
}

//returns the item's rank
public int rank() {
	return rank;
}

//sets a new name for the item
public void setName(String name) {
	this.name = name;
}

//sets a new weight for the item
public void setWeight(double weight) {
	this.weight = weight;
}

//sets a new price for the item
public void setPrice(double price) {
	this.price = price;
}

//sets a new rank for the item
public void setRank(int rank) {
	this.rank = rank;
}

//describes the item's details
public String toString() {
	return "The item's name is: "+this.name+" The item's weight is: "+this.weight+" The item's price is: "+this.price+" The item's rank is: "+this.rank;
}

//checks if the weight is the same and if it's different and prints true or false
public boolean isTheSameKg(Snack other) {
	if (getWeight() == other.getWeight()) {
		return true;
	}
	else {
		return false;
	}
}
}

