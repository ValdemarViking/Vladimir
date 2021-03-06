import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<People> list = new ArrayList<>();

		parseJson();
	//	parseGson();
	}

	public static void parseJson() {
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject root = (JSONObject) parser.parse(new FileReader("test.json"));
			
			String name = (String) root.get("name");
	    //	System.out.println(name);
			
			JSONArray people = (JSONArray) root.get("people");
		//	System.out.println(people);
			
		// List<String> list = new ArrayList();
			
			People myElement = new People();
		for(int i=0; i<people.size(); i++ ) {
			JSONObject item = (JSONObject) people.get(i);
			
			long peopleId =  (long)item.get("id");
		//	myElement.setId(Integer.valueOf(peopleId));
		    boolean peopleIsDegree = (boolean) item.get("isDegree");
		    
			long peopleAge = (long) item.get("age");
			
			String peopleName = (String) item.get("name");
			
			String peopleSurname = (String) item.get("surname");
						
			/* list.get(i); 
			System.out.println(peopleId);
			System.out.println(peopleIsDegree);*/
			
		}
					
		} catch (Exception e){
			System.out.println("ERROR = " + e.getMessage());	
		}
		
	}
		
		public static void parseGson() {
		
			try {
				BufferedReader bufferReader = new BufferedReader(new FileReader("test.json"));
				Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-DD, HH:mm").create();
				
				Root root = gson.fromJson(bufferReader, Root.class);
				
				System.out.println(root.toString());
				
				String json = gson.toJson(root);
				System.out.println(json);
				
				
			}catch(Exception e) {
				System.out.println("ERROR = " + e.getMessage());
			}
			
		}
		
	private static void BufferReader(FileReader fileReader) {
		// TODO Auto-generated method stub
		
		
		JSONArray arrray = new JSONArray();
		
		JSONObject resultJson = new JSONObject();
				

		resultJson.put("name","Vova");
		resultJson.put("age",new Integer(27));
		resultJson.put("is_student",new Boolean(true));
		
		resultJson.put("name","Dima");
		resultJson.put("age",new Integer(25));
		resultJson.put("is_student",new Boolean(true));
				
		System.out.println(resultJson.toString());
		
		
	//	FileWriter file = null; 
		
	}

	
}
