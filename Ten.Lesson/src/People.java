
public class People implements Comparable<People>{

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* @Override
		public int compareTo(People arg0) {

		 if (age == arg0.getAge())
			
		return 0;
		
		if (age < arg0.getAge());
		
		return -1;	
		
		return 1; 
		
		return name.compareTo(arg0.getName()); */
	
	@Override
	public int compareTo(People arg0) {

	//	arg0.getName().toLowerCase();
	 if (arg0.getName().contains("[aA]"))
	 {
	return 1;
	 }
	return -1;	
	}
	
	
	
	// return name.compareTo(arg0.getName());
		
		
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}

	
}
