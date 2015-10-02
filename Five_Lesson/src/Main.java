import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("Time: " + date.toString());
		System.out.println("Time long: " + date.getTime());
		System.out.println("Time second: " + date.getSeconds());

        SimpleDateFormat dateFormat = new SimpleDateFormat ("hh 'o''clock' a, zzzz");
        System.out.println("My time: " + dateFormat.format(new Date()));
        SimpleDateFormat dateFormat1 = new SimpleDateFormat ("dd MMMM yyyy, K:mm a, Z");
        System.out.println("My time: " + dateFormat1.format(new Date()));
        
        Date date1 = new Date();
        Date date2 = new Date(1443029729393l);
        
        if (date1.getTime() > date2.getTime()){
        	System.out.println("date1>date2.");
        }
    //    	  if (date1.after(date2)){
    //          	System.out.println("date1<date2.");
    //    }
	
        String dataString = "1980.12.20";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat ("yyyy.MM.dd");
        Date myDate;
        try {
        	myDate = dateFormat2.parse(dataString);
        	 System.out.println(myDate);
        } catch (ParseException e){
        System.out.println("Проблема");
       
	}
        GregorianCalendar cal = new GregorianCalendar();
        
        System.out.println(cal.get(GregorianCalendar.DATE));
        System.out.println(cal.get(GregorianCalendar.DAY_OF_WEEK));
        
        cal.set((GregorianCalendar.DATE), 25);
        System.out.println("День зарплаты: " + cal.get(GregorianCalendar.DATE));
        
      
        	
        
        
	}
}
