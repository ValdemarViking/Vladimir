import java.util.Date;


public class Main {

	public static void main (String[] args) {
	MyThread t = new MyThread();
	t.start();
	t.setDaemon(true);
	System.out.println("������� �����!!!");	
	try {
		Thread.sleep(6000);
		} catch (InterruptedException e){}
	t.interrupt();
	// System.out.println("����");
		
			
/*		Thread t = new Thread(new Runnable() {
			public  void run() {
			
				for (int i =0; i<11; i++){
					try {
								
					Thread.sleep(1000);
					Date curTime = new Date(); 
					
					System.out.println(curTime);
					} catch (Exception e){
						System.out.println("���");
					};
				}
				
			}

			private int getDate() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});

		
		Thread t2 = new Thread(new Runnable() {
			public  void run() {
				System.out.println("����� ����� a");
				System.out.println("����� ����� b");
				System.out.println("����� ����� c");
				System.out.println("����� ����� d");
				System.out.println("����� ����� e");
				System.out.println("����� ����� f");
			}
			
		}); 
		MyThread myT = new MyThread();
		
		t.start();
		// t2.start();
		
		System.out.println("������� �����!!!"); */
		
	}

}
