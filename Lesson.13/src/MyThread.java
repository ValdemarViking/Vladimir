import java.util.Date;


public class MyThread extends Thread {
	// public boolean isStart = true;
	public  void run() {
		int i = 0;
		while (!isInterrupted()){
			try {
				
				Thread.sleep(1000);

				} catch (InterruptedException e){
					System.out.println("���������, ����!");
					return;
				};
				System.out.println("����� ����� i = " + i);
				i++;
		}
	}
	
	
}
