/*Task_2

На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. 
Потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. 
Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. 
Гарантируется что любой продукт состоит из 1 слова. 
Названия продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
На окончания не обращайте внимание. 
ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */

package for_HW_Java.Homework2;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Укажите количество строк в поваренной книге: ");
        int n = iScanner.nextInt(); 
        iScanner.nextLine(); 
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Ваш новый рецепт: ");
            book[i] = iScanner.nextLine(); 
        }
        System.out.printf("Укажите количество продуктов, на которые у человека аллергия: ");
        int m = iScanner.nextInt(); 
        iScanner.nextLine(); 
        String[] allergens = new String[m];
        String[] substitutes = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("Укажите продукт, на который у человека аллергия, и через дефис (-) продукт-замену: ");
            String[] allergenSubstitute = iScanner.nextLine().split(" - "); 
            allergens[i] = allergenSubstitute[0];
            substitutes[i] = allergenSubstitute[1];
        }        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String allergen = allergens[i];
                String substitute = substitutes[i];
                book[i] = book[i].replaceAll("(?i)\\b" + allergen + "\\b", substitute);
            }
        }
        for (String line : book) {
            System.out.println(line);
        }
    }
}
