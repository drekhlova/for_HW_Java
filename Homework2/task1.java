/* Task_0
public class Task_0 {

Посчитайте сколько драгоценных камней в куче обычных камней

Пример:
jewels = “aB”, stones = “aaaAbbbB”

Результат в консоль ”a3B1”
public static void main(String[] args) {

}

public String findJewelsInStones(String jewels, String stones) {

    return "";
}
}

 */


package for_HW_Java.Homework2;

public class task1 {
    public static void main(String[] args) {
        String stones = "aaaAbbbB";
        String jewels = "aB";
        String result = findJewelsInStones(jewels, stones);
        System.out.println(result); 
    }

    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                char stone = stones.charAt(j);
                if (stone == jewel) {
                    count ++;
                }
            }
        result.append(jewel).append(count);
        }
        return result.toString();
    }
}