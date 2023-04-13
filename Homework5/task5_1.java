/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Пусть дан список сотрудников:

Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

package for_HW_Java.Homework5;
import java.util.*;

public class task5_1 {
         public static void main(String[] args) {
            List<String> workers = Arrays.asList(
                    "Иван Иванов",
                    "Светлана Петрова",
                    "Кристина Белова",
                    "Анна Мусина",
                    "Анна Крутова",
                    "Иван Юрин",
                    "Петр Лыков",
                    "Павел Чернов",
                    "Петр Чернышов",
                    "Мария Федорова",
                    "Марина Светлова",
                    "Мария Савина",
                    "Мария Рыкова",
                    "Марина Лугова",
                    "Анна Владимирова",
                    "Иван Мечников",
                    "Петр Петин",
                    "Иван Ежов"
            );
    
            Map<String, Integer> nameCounts = new HashMap<>();
            for (String worker : workers) {
                String name = worker.split(" ")[0];
                nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
            }
    
            List<Map.Entry<String, Integer>> sortedNameCounts = new ArrayList<>(nameCounts.entrySet());
            Collections.sort(sortedNameCounts, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                    return b.getValue().compareTo(a.getValue());
                }
            });
    
            for (Map.Entry<String, Integer> entry : sortedNameCounts) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }



/* Алгоритм пирамидальной сортировки (HeapSort)
public static void heapSort(int[] arr) {
        int n = arr.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Извлечение элементов из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Построение кучи в поддереве с корневым узлом i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // Левый = 2*i + 1
        int r = 2*i + 2; // Правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно кучифицируем поддерево
            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Random rand = new Random();

        System.out.println("Исходный массив:");

        // Заполнение массива случайными числами и вывод его на экран
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000);
            System.out.print(arr[i] + " ");
        }

        heapSort(arr);

        System.out.println("\nОтсортированный массив:");

        // Вывод отсортированного массива на экран
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
*/