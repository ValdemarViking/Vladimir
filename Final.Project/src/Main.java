import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Main {

	public static void main(String[] args) {
		List<Employees> list = new ArrayList<>();
		parseJson();

		}

		public static void parseJson() {
			
			JSONParser parser = new JSONParser();
			try {
				JSONObject root = (JSONObject) parser.parse(new FileReader("birthdays.json"));
				
				String name = (String) root.get("name");
				
				JSONArray employees = (JSONArray) root.get("employees");
			
				Employees myElement = new Employees();
			for(int i=0; i<employees.size(); i++ ) {
				JSONObject item = (JSONObject) employees.get(i);
				
				long peopleId =  (long)item.get("id");

			    boolean peopleIsDegree = (boolean) item.get("isDegree");
			    
				long peopleAge = (long) item.get("age");
				
				String peopleName = (String) item.get("name");
				
				
			}
						
			} catch (Exception e){
				System.out.println("ERROR = " + e.getMessage());	
			}
				
		}

	}

}
