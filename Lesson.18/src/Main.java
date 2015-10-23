import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test<String> test1 = new Test<>("STRING");
		String myString = test1.get();
		
		Test<Integer> test2 = new Test<>(123);
		int mInt = test2.get();	
		
	
	}
	private static void runEvent1(){
		Event1 event1 = new Event1();
		event1.setEvent1message("kjfrsdhb");
		
		event1.isErrored();
	//	parseError(event1);
		
	}
    private static void runEvent2(){
		Event2 event2 = new Event2();
		event2.setId(123);
		
	//	parseError(event2, );
		
	}
    
    private static <T extends SuperEvent> void parseError(T Event, Class<SuperEvent> classEvent, Object event){
    	event.setErrored(true);
    	sendEvent(event);
    	
    }
    
    
    private static void sendEvent(Object event){
    	//отправка
    }
}
