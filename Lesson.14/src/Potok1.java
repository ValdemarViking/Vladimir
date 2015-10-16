
public class Potok1 extends Thread{
	
//	public final 
	
	public void run()
	{
		System.out.println ("Start potok 1");	
		
		
		for (int i=0; i<10; i++){
			System.out.println (i);
		}
		
		System.out.println ("Stop potok 1");
	}
	

}
