import java.util.Scanner;
public class matrix {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // Ввод размеров первой матрицы A
        System.out.println("Введите количество строк первой матрицы (n): ");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов первой матрицы (m): ");
        int m = scanner.nextInt();

        // Ввод размеров второй матрицы B
        System.out.println("Введите количество строк второй матрицы (p): ");
        int p = scanner.nextInt();
        System.out.println("Введите количество столбцов второй матрицы (q): ");
        int q = scanner.nextInt();

        // Проверка возможности умножения матриц
        if (m != p) {
            System.out.println("Ошибка: количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
            scanner.close();
            return; // Завершаем программу
        }

        int[][] A = new int[n][m];
        int[][] B = new int[p][q];
        int[][] C = new int[n][q]; // Результирующая матрица размером n x q

        // Ввод первой матрицы A
        System.out.println("Введите элементы первой матрицы A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Ввод второй матрицы B
        System.out.println("Введите элементы второй матрицы B:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Умножение матриц
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                C[i][j] = 0;
                for (int k = 0; k < m; k++) {  // k соответствует числу столбцов первой матрицы и строк второй
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Вывод результата
        System.out.println("Результат умножения матриц C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}