package assignment4;

public class Property {

private String city;

private String owner;

private String propertyName;

private double rentAmount;
private Plot Plot;

private int width;

private int depth;

private int x;

private int y;

public Property () {

city = "";

owner = "";

propertyName = "";

rentAmount = 0;}

public Property (Property p)

{
city = p.city;

owner = p.owner;

propertyName = p.propertyName;

rentAmount = p.rentAmount;

}

public Property(String propertyName, String city, double rentAmount,String owner, int x,int y, int width, int depth) {

	this.city = city;
	this.owner = owner;
	this.propertyName = propertyName;
	this.rentAmount = rentAmount;
	this.x = x;
}   


public String getCity() {

return city;

}

public String getOwner() {

return owner;

}

public String getPropertyName() {

return propertyName;

}

public double getRentAmount() {

return rentAmount;

}

public void setCity(String city) {

this.city = city;


}

public Plot setPlot(int x, int y, int width, int depth) {
	
	this.x = x;
	this.y = y;
	this.width = width;
	this.depth = depth;

return Plot;


}


public void setRentAmount(double rentAmount) {

this.rentAmount = rentAmount;

}



public void setOwner(String owner) {

this.owner = owner;

}
@override 
public String toString() {


return "Property Name: "+this.propertyName+"\n"+

"Located: "+this.city+"\n"+

"Belonging to: "+this.owner+"\n"+

"Rent Amount: "+this.rentAmount;

}

}