package javaStarter;

public class ArraysOfString {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 10;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		String[] str = new String[3];
		str[0] = "привет";
		str[1] = "вперёд !";
		str[2] = "java";
		System.out.println(str[0]);
		System.out.println(str[2]);
		System.out.println(str[1]);

		for(int i = 0; i < str.length; i++){
			System.out.println(str[i]);
		}
		System.out.println("--- foreach ---");
		for (String strings : str) {
			System.out.println(strings);
		}
		System.out.println("--- sum of nums in foreach ---");
		int[] numbers1 = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int x:
		     numbers1) {
			sum += x;
		}
		System.out.println("Сумма в массиве равна = " + sum);

		int value = 0; //выделегние памяти 32 бита
		String s = null; // выделяется память только под ссылку
		System.out.println(s);
	}
}
