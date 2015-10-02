package Model;

public abstract class Animal {
	
	public int kolichestvoNog;
	public String name;
	public String poroda;
	
	public String getPoroda() {
		return poroda;
	}
	public void setPoroda(String poroda) {
		this.poroda = poroda;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKolichestvoNog() {
		return kolichestvoNog;
	}
	public void setKolichestvoNog(int kolichestvoNog) {
		this.kolichestvoNog = kolichestvoNog;
	}

	
}
