import Model.Bus;
import Model.Car;
import Model.Transport;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transport transport;
		if (true) {
			transport = new Car();
			
		}
		else {
			transport = new Bus ();
		}
		transport.build();
		
Car car = new Car ();
car.setModel("fxgh");
car.build();
System.out.println(car.toString());

Bus bus = new Bus ();
bus.setYear(1999);
bus.build();


	}

}
