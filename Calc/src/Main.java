import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double one = 0;
		double two = 0;
		String toDo = null;
		
		System.out.println("������� ����� 1");
		try {
		one = sc.nextDouble();}
		catch (Exception e){
			System.out.println("������������ ��������, ���������� ��� ���))");
			return; 
		}
		System.out.println("������� ����� 2");
		try {
		two = sc.nextDouble();}
		catch (Exception e){
			System.out.println("������������ ��������, ���������� ��� ���))");
			return; }
		sc.nextLine(); 
		System.out.print("�������� �������� (+,-,*,/): ");
			try {
				
				toDo = sc.nextLine(); }
			catch (Exception e1){
					System.out.println("����������� ������ ����� (+,-,*,/)");
					return; }
				
		switch (toDo){
		case "+":
			System.out.println("�����: " + (one+two));
			break;
		case "-":
			System.out.println("�����: " + (one-two));
			break;
		case "*":
			System.out.println("�����: " + (one*two));
			break;	
		case "/":
			if (two == 0)
				System.out.println("������ ������ �� ����");	
			else
			System.out.println("�����: " + (one/two));	
			break;	
			default:
			System.out.println("������������ ��������");	
		}
						
	}
	
}