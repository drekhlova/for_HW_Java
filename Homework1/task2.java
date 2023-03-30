/* Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. 
Затем вводится число, на которое нужно умножить все введённые выше числа. 
Выведите на экран результат умножения построчно.

Sample Input:
4
1
2
3
5
2
Sample Output:

2
4
6
10
 */

package for_HW_Java.Homework1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество чисел N и целые числа n: ");
        int n = iScanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = iScanner.nextInt();
            }
        System.out.printf("Введите множитель X: ");
        int x = iScanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * x;
            System.out.println(arr[i]);
            }   
    }
}
