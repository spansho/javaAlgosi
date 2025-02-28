import java.util.Scanner;
public class slojenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ввод 1 матрицы
        System.out.print("Введите количество строк первой матрицы: ");
        int n1 = scanner.nextInt();
        System.out.print("Введите количество столбцов первой матрицы: ");
        int m1 = scanner.nextInt();
        //ввод 2 матрицы
        System.out.print("Введите количество строк второй матрицы: ");
        int n2 = scanner.nextInt();
        System.out.print("Введите количество столбцов второй матрицы: ");
        int m2 = scanner.nextInt();
        //проверка
        if (n1 != n2 || m1 != m2) {
            System.out.println("Ошибка: Матрицы должны быть одинакового размера для сложения.");
            return;
        }
        int[][] matrix1 = new int[n1][m1];
        int[][] matrix2 = new int[n2][m2];
        int[][] resultMatrix = new int[n1][m1];
        //ввод матрица 1
        System.out.println("Введите элементы первой матрицы:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        //ввод матрица 2
        System.out.println("Введите элементы второй матрицы:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        //сложение
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //вывод
        System.out.println("Результат сложения матриц:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}