package Model;

public class Car extends Transport {
	
	public static final int TYPE_SEDAN = 0;
	public static final int TYPE_UNIVERSAL = 1;
	public static final int TYPE_HACHBACK = 2;
	
private int type;

public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
@Override
public void build() {
	System.out.println("Вызвано из машины");
	
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + type;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	if (type != other.type)
		return false;
	return true;
}
}
