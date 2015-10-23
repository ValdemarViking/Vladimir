
public class Test <T, C> {
	
	private T value1;
	private C value2;

	public Test(T value1, C value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public T getT() {
		return value1;
	}
	public C getC() {
		return value2;
	}

}
