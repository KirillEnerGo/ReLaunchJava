package javaStarter;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных
        char character = 'a';
        String s = "hola"; //ссылочный тип данных на обьект класса String
        String str = new String("world");
        // Массив - ссылочный тип данных
        int[] numbers = new int[5];
        System.out.println(numbers[0]); // по умолчанию все элементы инициализированны 0-ми
        //инициализация
        numbers[0] = 10;
        numbers[1] = 20;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Инициализация элемента: " + i + " = "+ numbers[i]);
        }
        //заранее знаем значения для массива
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
        }

    }
}
