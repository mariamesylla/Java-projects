package assignment4;

public class ManagementCompany {
int index=0;
private int MAX_PROPERTY = 5;
private double mgmFeePer;
private String name="";
private Plot plot;
private Property[] properties=new Property[MAX_PROPERTY];
private String taxID="";
public ManagementCompany(String name, String taxID, int mgmFee) {

this.name=name;

this.taxID=taxID;

this.mgmFeePer =mgmFee;

}

public int addProperty(Property property) {

if(index>=MAX_PROPERTY){

return -1;

}else{

properties[index]=property;

index++;
return index-1;

}   

}
public ManagementCompany(String name, String taxID, int mgmFee,int x, int y, int width, int depth) {
}


public int getMAX_PROPERTY() {

return MAX_PROPERTY;

}


public double	getMgmFeePer()	{
return mgmFeePer;
}
public String	getName() {	
return name;
}
public Plot	getPlot()	{
return plot;
}
public String	getTaxID()	{
return taxID;
}

public void	setMgmFeePer​(double mgmFeePer) {	
this.mgmFeePer= mgmFeePer;
}

public void	setName​(String name) {	
this.name=name;
}
public void	setPlot​(Plot plot) {

}
public double totalRent() {

double totalRent = 0;
for(int i=0;i<properties.length;i++){

totalRent+=properties[i].getRentAmount();

}

return totalRent;
}
public double maxRentProp() {
	return MAX_PROPERTY;
	
	
}
public int maxRentPropertyIndex() {
	double maxRent=0;
	int maxRentIndex=0;
	for(int i=0;i<properties.length;i++){
	if(maxRent<properties[i].getRentAmount()){

	maxRent=properties[i].getRentAmount();

	maxRentIndex=i;

	}

	}

	return maxRentIndex;

	}

public String displayPropertyAtIndex(int index) {
	String output=properties[index].toString();

	return output;

	}

public String toString() {   

for(int i=0;i<properties.length;i++){

properties[i].toString();

}

return ("List of the properties for Mananagemen Company, " + "total management Fee:"+this.mgmFeePer);

}

}