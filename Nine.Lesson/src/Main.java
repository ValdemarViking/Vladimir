import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		// 
		Random r = new Random();

		//	ArrayList<Integer> arr = new ArrayList<>();
		//	for (int i =0; i<10; i++){
		//		arr.add(i, r.nextInt());		
		//	}
		
		//	Collections.sort(arr);
		
		//	for (int i =0; i<10; i++){	
		//		System.out.println(" " + arr.get(i));
		// }
	
		//HashSet<String> hs = new HashSet<String>(); {
		//	hs.add("111");
		//	hs.add("aaa");
		//	hs.add("222");
		//	hs.add("bbb");
		//	hs.add("333");
		//for (int i =0; i<hs.size(); i++){
		//	System.out.println(hs.(i));
		//}
		//}
		//TreeSet<String> ts = new TreeSet<String> ();
		//ts.add("")
		
		HashMap<String, String> hm = new HashMap<String, String> ();
				
		hm.put("KEY", "value1");
		hm.put("KEY1", "value2");
		hm.put("KEY2", "value3");
		hm.put("KEY2", "value4");
		hm.put("KEY2", "value5");
		hm.put("KEY3", "value6");
		
		String value = hm.get("KEY");
		
		/*Iterator iterato = (Iterator) hm.entrySet();
		while (iterato.hasNext()){
			Map.Entry pp = (Map.Entry) iterato.next();
		
		System.out.println("KEY= " + pp.getKey());
		System.out.println("value= " + pp.getValue());
		} */
		for (String key: hm.keySet()){
			System.out.println("KEY= " + key);
			System.out.println("value= " + value);
		}
		
		
		
	}
}