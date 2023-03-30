/* Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива, найдите их кубы.

Sample Input:

8
11
Sample Output:

512
1331
 */

package for_HW_Java.Homework1;
import java.util.Scanner;

public class task1 {
    public static int[] getCubes(int[] arr, int a, int b) {
        int[] result = new int[2];
        result[0] = arr[a-1];
        result[1] = arr[b-1];
        return result;
        }
    public static void main(String[] args) { 
        int[] arr = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            arr[i - 1] = i * i * i;
            }
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        int[] result = getCubes(arr, a, b);
        System.out.println("Куб числа" + " " + a + " " + "равен: " + result[0]);
        System.out.println("Куб числа" + " " + b + " " + "равен: " + result[1]);
}
}
