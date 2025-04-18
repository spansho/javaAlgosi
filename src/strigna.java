import java.util.Stack;

public class strigna {
    public static String reverseString(String input) {
        char[] chars = input.toCharArray(); // Преобразуем строку в массив символов
        int left = 0, right = chars.length - 1;
        while (left < right) {
            // Меняем местами символы
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Двигаем указатели
            left++;
            right--;
        }
        return new String(chars); // Создаем строку из измененного массива
    }

    // Метод для проверки правильности скобок
    public static boolean checkBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }
}