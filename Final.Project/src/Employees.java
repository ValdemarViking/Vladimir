import java.text.SimpleDateFormat;
import java.util.Date;


public class Employees {

	private int id;
	private String name;
	private String degree;
	private Date dateOfBirth;
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	private int yearEperience;
	/*
    "emails": [
		  "2342342@gmail.com",
 		  "ssdfdf@gmail.com"
 	 ],  */
	private boolean visible;
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", degree=" + degree
				+ ", dateOfBirth=" + dateOfBirth + ", yearEperience="
				+ yearEperience + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getYearEperience() {
		return yearEperience;
	}
	public void setYearEperience(int yearEperience) {
		this.yearEperience = yearEperience;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	

	
}
