/* Task_2
Пусть дан произвольный список целых чисел, удалить из него чётные числа 

Task_3 
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
*/

import java.util.ArrayList;
import java.util.List;

public class task2_3 {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Исходный список: " + list);
        List<Integer> newList = removeEvenValue(list);
        System.out.println("Список после удаления четных чисел: " + newList);
        System.out.println("Минимальное значение: " + getMin(newList));
        System.out.println("Максимальное значение: " + getMax(newList));
        System.out.println("Среднее значение: " + getAverage(newList));
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for (Integer num : list){
            if (num % 2 != 0){
                newList.add(num);
            }
        }
        return newList;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        Integer min = Integer.MAX_VALUE;
        for (Integer num : list){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        Integer max = Integer.MIN_VALUE;
        for (Integer num : list){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        Integer sum = 0;
        for (Integer num : list){
            sum += num;
        }
        return sum / list.size();
    }
}