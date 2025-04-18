import java.util.Scanner;
import java.util.Stack;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Первая задача - переворот строки
        System.out.println("Введите строку для переворота:");
        String inputString = scanner.nextLine();
        System.out.println("Перевернутая строка: " + strigna.reverseString(inputString));

        // Вторая задача - проверка скобок
        System.out.println("Введите строку со скобками:");
        String inputBrackets = scanner.nextLine();
        System.out.println("Результат проверки скобок: " + strigna.checkBrackets(inputBrackets));

        scanner.close();
    }

