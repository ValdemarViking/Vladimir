import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

	public static void main(String[] args) {


		List<People> list = new ArrayList<People>();
		People pl = new People();
		pl.setName("BBB");
		pl.setAge(45);
		
		
		People p2 = new People();
		p2.setName("GGaGG");
		p2.setAge(30);
		
		People p3 = new People();
		p3.setName("bbbbaa");
		p3.setAge(40);
		
		list.add(pl); list.add(p2); list.add(p3); 
		
		Collections.sort(list);
		/*
		class SortByAge implements Comparator<People> {
		@Override
		public int compare(People o1, People o2){
		
		 if (o1.getAge() == o2.getAge())
		 {
					return 0;
		 }
		if (o1.getAge() < o2.getAge())
		{
		return -1;	
		}
		return 1;
		
		} 
		
			
		
		}*/
		
		System.out.println(list);
	}
	
	
}