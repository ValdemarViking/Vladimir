package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		x = 101;


		long z;
		z = 6;	
		
		boolean isYes=true;
		float g;
		g = 6.556f;//потому что гладиолус
		double gg;
		gg = 4.3546432;
		/**
		 * == если равно
		 * != если не равно
		 */
		String text1 = "Hello " + "world!";
		String text = new String ("Hello");

	switch (15){
	case 10:
		System.out.println("жопа");
		break;
	case 15:
	    System.out.println(text1.charAt(text1.length() - 6));//соедин€ет строки
	    break;
	default:
	System.out.println("нет такого");
    break;
	}
	int[] n = new int [5];
	n[0]=10;
	n[1]=11;
	n[2]=12;
	n[3]=13;
	n[4]=14;

	for (int i=0; i<n.length; i++){
		System.out.print(n[i]);
	}
	int l=0;
	while (l<n.length) {
		System.out.print(n[l]);
		l++;
	}
	System.out.println();
	for (int inner: n){
		System.out.println(inner);
	}	
	String[] textArray = new String [5];
	textArray[0]="–аз, ";
	textArray[1]="два, ";
	textArray[2]="три, ";
	textArray[3]="четыре, ";
	textArray[4]="п€ть.";
	
	String totalText = new String();
	for (String inner: textArray){
		totalText = totalText.concat(inner);
		}
	System.out.println(totalText);
	}
}

