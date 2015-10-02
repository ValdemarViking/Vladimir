package Model;

public class Cat extends Animal {

	public boolean isKastrirovany() {
		return isKastrirovany;
	}

	public void setKastrirovany(boolean isKastrirovany) {
		this.isKastrirovany = isKastrirovany;
	}

	private boolean isKastrirovany = true;
}
