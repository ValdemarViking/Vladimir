import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EightLesson {

	public static void main(String[] args) {
	/*	���������� ������� ���������, ������� ������ ��������� ���������� �����,  
	 * �� �� ������ ���������� �����, � ��� ����������� �� ����� ��������. 
	 *	�������� ������ � ��� ����� ����������, ��� ���������� ������ ����� 
	 *� ����� +375 29 555-55-55.
		��� ������� ����� ������� � ������ ���������� ���� �� ���������.*/

		String telNumber = new String();
		Scanner in = new Scanner (System.in);
		
		System.out.println("������� ���������� �����");
		telNumber = in.nextLine();
				
		Pattern p = Pattern.compile("[+375]{1}[29||33||44]d{7}");
		Matcher m = p.matcher(telNumber);
		boolean b = m.matches();
		if (b = true) {
			System.out.println("���������� ����� �����");
		}
			else 
			System.out.println("���������� ����� �� �����");
		}
		
		
	

}
