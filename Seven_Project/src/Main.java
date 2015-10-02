
public class Main {

	public static void main(String[] args) {
		System.out.println("main");
		ScreenVeiw screenveiw = new ScreenVeiw();
		
		//* TODO Auto-generated method stub1. Создаем Интерфейс Click с методом onClick().
		//Создаем класс Button, в котором создаем переменную с типом Click и set метод для него.
		//Создаем класс ScreenView и реализуем в нем интерфейс Click. В классе ScreenView создаем метод showUI() в котором создаем объект Button и вызываем в нем метод setClick для установки переменной которую создали внутри класса Button - в даном случае это будет this так как мы реализовали интерфейс в ScreenView и уже находимся в этом объекте.

		//Теперь внутри класса Button создаем метод test(); в котором вызываем метод onClick() у переменной которую мы уже задали (тип Click).
		//этот метод вызываем в showUI() после установки значения set для Button.

		//Во всех методах ставим пометки System.out.println("имя метода")

		//Из класса Main где запускаем программу создаем объект класса ScreenView и вызываем у него метод showUI().


	}

}
