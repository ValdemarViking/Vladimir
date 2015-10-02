package Model;

public class Bus extends Transport {
private boolean isCity;

public boolean isCity() {
	return isCity;
}

public void setCity(boolean isCity) {
	this.isCity = isCity;
}

@Override
public void build() {
	System.out.println("Вызвано из автобуса");
	
}
}
