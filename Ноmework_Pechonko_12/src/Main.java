
public class Main {
	
	public static void main (String[] args) {
	
		Main main = new Main();
	MyThread myThread1 = new MyThread();
	
	myThread1.setMain(main);
	
	MyThread myThread2 = new MyThread();
	myThread2.setMain(main);
	
	myThread1.start();
	
/*	try {
		myThread1.wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	myThread2.start();
/*	try {
		myThread2.join();
	}catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	myThread1.notify();*/
	
	}
		
	public void print10(){
		
	synchronized (this){
			
		System.out.print("\n" + "thread name = " + Thread.currentThread().getName() + ": ");
	
		for (int i=0; i<10; i++){
			
			System.out.print (i + " ");
			}
		}
	
	
	

	}

}
//String name