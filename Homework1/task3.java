/* Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
 */


 package for_HW_Java.Homework1;
 import java.util.Scanner;

public class task3 {
        public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("""
        Добро пожаловать в калькулятор! 
        Пожалуйста, последовательно введите два числа: 
        """);
        int number1 = iScanner.nextInt();
        int number2 = iScanner.nextInt();
        System.out.printf("""
        Выберите действие: 
        1. Сложение
        2. Вычитание
        3. Умножение
        4. Деление
        5. Закрыть калькулятор
        """);
        int choose = iScanner.nextInt();
        switch (choose) {
        case 1:
            System.out.println("Ответ: " + addition(number1, number2));
            break;
        case 2:
            System.out.println("Ответ: " + subtraction(number1, number2));
            break;      
        case 3:
            System.out.println("Ответ: " + multiplication(number1, number2));
            break;
        case 4:
            System.out.println("Ответ: " + division(number1, number2));
            break;
        case 5:
            break;
        }
    }

    public static int addition(int x, int y) {
        int result = x + y;
        return result;
    }
    public static int subtraction(int x, int y) {
        int result = x - y;
        return result;
    }
    public static int multiplication(int x, int y) {
        int result = x * y;
        return result;
    }
    public static float division(float x, float y) {
        float result = x / y;
        return result;
    }

}