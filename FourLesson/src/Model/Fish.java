package Model;

public class Fish extends Animal  {
	public static final int TYPE_MORSKAYA= 0;
	public static final int TYPE_RECHNAYA = 1;
	public static final int TYPE_PROCHIE = 2;
	
private int type;

public int getType() {
	return type;
}

public void setType(int type) {
	this.type = type;
}
}
