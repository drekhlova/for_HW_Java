//Task_5
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

package for_HW_Java.Homework4;
import java.util.*;

public class task4_5 {
    public static void main(String[] args) {
        String symbols = "()[](){[()]}()()";   
        // String symbols = ")()(";   // false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < symbols.length(); i++) {
            char s = symbols.charAt(i);
            if (s == '(' || s == '[' || s == '{') {
                stack.push(s);  // push - добавляет элемент в верх стека
            } 
            else if (s == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();    // pop -  удаляет верхний элемент из стека и возвращает его
            } 
            else if (s == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            else if (s == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
            else {
                System.out.println("False");
                return;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("True");
        } 
        else {
            System.out.println("False");
        }
    }
}