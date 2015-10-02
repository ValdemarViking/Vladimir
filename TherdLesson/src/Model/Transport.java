package Model;

public abstract class Transport {
	
protected int year;
private String model;

public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public abstract void build(); 

}
