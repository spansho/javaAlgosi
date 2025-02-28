import java.util.Scanner;

public class matr_na_chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размеров матрицы
        System.out.print("Введите количество строк (n): ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов (m): ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Ввод числа, на которое нужно умножить матрицу
        System.out.print("Введите число для умножения: ");
        int scalar = scanner.nextInt();

        // Умножение матрицы на число
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }

        // Вывод результата
        System.out.println("Результат умножения матрицы на число:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close(); // Закрытие Scanner
    }

}