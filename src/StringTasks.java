import java.util.Scanner;

public class StringTasks {
    // Метод для переворота строки


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
    public static String checkBrackets(String input) {
        int count = 0;

        // Проходим по каждому символу строки
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            // Открывающая скобка увеличивает счетчик
            if (symbol == '(') {
                count++;
            }

            // Закрывающая скобка уменьшает счетчик
            if (symbol == ')') {
                count--;
            }

            // Если счетчик становится отрицательным, значит скобки расставлены неправильно
            if (count < 0) {
                return "Неправильно";
            }
        }

        // В конце проверяем, все ли скобки закрыты
        if (count == 0) {
            return "Правильно";
        } else {
            return "Неправильно";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Первая задача - переворот строки
        System.out.println("Введите строку для переворота:");
        String inputString = scanner.nextLine();
        System.out.println("Перевернутая строка: " + reverseString(inputString));

        // Вторая задача - проверка скобок
        System.out.println("Введите строку со скобками:");
        String inputBrackets = scanner.nextLine();
        System.out.println("Результат проверки скобок: " + checkBrackets(inputBrackets));

        scanner.close();
    }
}