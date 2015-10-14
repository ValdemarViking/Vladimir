/**
 * 
 */
package by.pvt.main;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/**
 * @author USER
 *
 */
public class PracticeRunner {

	/**
	 * @param args
	 */
	
	public static void invertation(String s){
		char[] str = s.toCharArray();
		int n = s.length();
		int m = s.length()/2;
		n--;
		for(int i=0; i<m; i++){
			char t = str[i];
			str[i]=str[n-i];
			str[n-i]=t;
		}
		s = String.valueOf(str);
		System.out.println(s);
	}
	public static void countGlasnue(String s){
		int count = 0;
		Set<Character> leters = new HashSet<Character>();
		char[] str = s.toCharArray();
		for(int i=0; i<s.length(); i++){
			leters.add(str[i]);
		}
		System.out.println(String.valueOf(leters));
		char[] glasnue = {'a', 'e', 'y', 'u', 'i', 'o'};
		
	}
	public static void main(String[] args) {
		String s = "qwe123asd";
		invertation(s);
		countGlasnue(s);
		
	}

}
