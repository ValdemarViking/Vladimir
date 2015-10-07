import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class Main {

	public static void main(String[] args) {


		InputStream inputStream = null;
		FileOutputStream fileOutPutStream = null;
		
		try{
			
			URL url = new URL ("http://www.ecb.europa.eu/stats/eurofxref/eurofxref-hist.xml");
			HttpURLConnection connection =(HttpURLConnection) url.openConnection();
			
			int status  = connection.getResponseCode();
			if (status == HttpURLConnection.HTTP_OK){
				
				inputStream = connection.getInputStream();
				
				File file = new File("ttt.xml");
				fileOutPutStream = new FileOutputStream(file);
				
				int byteRead = -1;
				byte[] bufer = new byte[4096];
				while((byteRead = inputStream.read(bufer)) !=1) {
					fileOutPutStream.write(bufer, 0, byteRead);
				}
				
			}
			
		} catch (Exception e){
			
		} finally {
			if (inputStream != null){
				
				try {
					inputStream.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (fileOutPutStream != null){
					
					try {
						fileOutPutStream.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}	
				
			}
		}
	}
	}
}
