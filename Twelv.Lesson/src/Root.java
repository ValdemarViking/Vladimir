import java.util.List;


public class Root {

	@Override
	public String toString() {
		return "Root [name=" + name + ", people=" + people + "]";
	}
	public Root() {
		super();
	}
	private String name;
	private List<People> people;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<People> getPeople() {
		return people;
	}
	public void setPeople(List<People> people) {
		this.people = people;
	}

	
}
