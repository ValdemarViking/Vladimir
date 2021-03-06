
public class Element {

	@Override
	public String toString() {
		return "Element [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", Degree=" + isDegree + "]" + "\n";
	}
	private int age;
	private int id;
	private boolean isDegree;
	private String name;
	private String surname;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isDegree() {
		return isDegree;
	}
	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
