import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException  {
		
	/*	String str = "������ � ������ ����������� �������� �� ������� � ���������� ��������������� ������������ ������ ��������� �� ������� ����� ��������� �������. ��� ���������� � ����� ���������� � ���������� ���������, ��������� �������, ��� ������ ��������� ����������� ����� ������� ���������� � ������������, ������������, � ����� ��������� �� ��, ��� ����� ������ �� ������ ����� ������������� �������.";

		final String[] slova = str.split("[,;:.!?\\s]+");
		
		Arrays.sort(slova, new SortedByName());
		
		for (int i = 0; i<= slova.length; i++){
			System.out.println(slova[i].toString());
		}
		
		*/
		

		        File file = new File( "D:\\text.txt" );

		        BufferedReader br = null;;
				try {
					br = new BufferedReader (
					    new InputStreamReader(new FileInputStream( file ), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        String line = null;
		        
		        String lastChar = br.readLine().endsWith();
		        
		        switch (br.readLine().endsWith())
		        /*

		        if ((line = br.readLine()).endsWith("7")){
		        	line = line.toUpperCase();
		        	System.out.println( line );
		        } else if ((line = br.readLine()).endsWith("8")){
		        	line.toUpperCase();
		        	System.out.println( line );
		        }
		        else if ((line = br.readLine()).endsWith("9")){
		        	line.toUpperCase();
		        	System.out.println( line );
		        } else 
		        	System.out.println( line ); */
		        br.close();
		    }
		
	/*
		String number = new String();
		Scanner in = new Scanner (System.in);
		
		System.out.println("������� ����������� �����");
		number = in.nextLine();
		if (number.length() !=3){
			System.out.println("����� �� �����������((");
		} else
			if (number.charAt(0)==number.charAt(1)&& number.charAt(1)==number.charAt(2)){
				System.out.println("����� ����������");
			} else if (number.charAt(0)== number.charAt(1)- 1 && number.charAt(1)==number.charAt(2) - 1){
				System.out.println("����� ����������");
			} else 
				System.out.println("����� ������������");
		
*/
	
	
	}


