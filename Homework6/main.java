/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

package for_HW_Java.Homework6;
import java.util.*;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List notebooks = new ArrayList();
        notebooks.add(new notebook("Samsung", "Galaxy book NP750", 8, 256, "Windows 11 Home", "Silver", 49340));
        notebooks.add(new notebook("Huawei", "MateBook D 15 BOD-WDI9", 8, 256, "Windows 11 Home", "Gray", 36990));
        notebooks.add(new notebook("Msi", "Sword 17 A11UD-809XRUo", 16, 512, "Free DOS", "White", 87990));
        notebooks.add(new notebook("Asus", "Vivobook 15 X515EA-BQ1189", 8, 256, "Free DOS", "Gray", 44990));

        Map filters = new HashMap();
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Производитель");
        System.out.println("2 - Модель");
        System.out.println("3 - Объем оперативной памяти");
        System.out.println("4 - Объем жесткого диска");
        System.out.println("5 - Операционная система");
        System.out.println("6 - Цвет");
        System.out.println("7 - Цена");
        System.out.println("*******************");

        Scanner scanner = new Scanner(System.in);
        int filterNumber = scanner.nextInt();
        String filterKey = "";
        switch (filterNumber) {

            case 1:
                filterKey = "brand";
                System.out.println("*******************");
                System.out.println("Введите производителя: ");
                String brand = scanner.next();
                filters.put(filterKey, brand);
                break;

            case 2:
                filterKey = "model";
                System.out.println("*******************");
                System.out.println("Введите модель: ");
                String model = scanner.next();
                filters.put(filterKey, model);
                break;

            case 3:
                filterKey = "RAM";
                System.out.println("*******************");
                System.out.println("Введите объем оперативной памяти: ");
                int RAM = scanner.nextInt();
                filters.put(filterKey, RAM);
                break;

            case 4:
                filterKey = "HDD";
                System.out.println("*******************");
                System.out.println("Введите объем жесткого диска: ");
                int HDD = scanner.nextInt();
                filters.put(filterKey, HDD);
                break;

            case 5:
                filterKey = "OS";
                System.out.println("*******************");
                System.out.println("Введите операционную систему: ");
                String OS = scanner.next();
                filters.put(filterKey, OS);
                break;

            case 6:
                filterKey = "color";
                System.out.println("*******************");
                System.out.println("Введите цвет: ");
                String color = scanner.next();
                filters.put(filterKey, color);
                break;

            case 7:
                filterKey = "price";
                System.out.println("*******************");
                System.out.println("Введите цену: ");
                double price = scanner.nextDouble();
                filters.put(filterKey, price);
                break;
        }

        List<notebook> filteredNotebooks = filter.filter(notebooks, filters);
        if (filteredNotebooks.size() == 0) {
            System.out.println("Товар не найден");
        } 
        else {
            for (notebook notebook : filteredNotebooks) {
                System.out.println("Найдено по заданному критерию: Ноутбук" + " " + notebook.getBrand() + " " + notebook.getModel() + "/Объем оперативной памяти: " + notebook.getRAM() + "/Объем жесткого диска: " + notebook.getHDD() + "/Операционная система: " + notebook.getOS() + "/Цвет: " + " " + notebook.getColor() + "/Цена: " + " " + notebook.getPrice());
            }
        }
    }
}
        
