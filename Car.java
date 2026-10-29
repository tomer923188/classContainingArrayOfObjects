
public class Car {
	private String type;
	private String color;
	private double km;


public Car(String type, String color, double km) {
	this.type = type;
	this.color = color;
	this.km = km;
}
//returns the type of the car
public String getType() {
	return type;
}
//returns the color of the car
public String getColor() {
	return color;
}
//returns how many km are on the car
public double getKm() {
	return km;
}
//sets a new type
public void setType(String type) {
	this.type = type;
}
//sets a new color
public void setColor(String color) {
	this.color = color;
}

public void setKm(double km) {
	this.km = km;
}
//describes the car
public String toString() {
	return "The car has: "+this.km+"The color's is: "+this.color+"The type is: "+this.type;
}
}