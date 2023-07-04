import java.util.Scanner;

/*
        Найти положительные элементы главной диагонали квадратной матрицы.
*/
public class Task_20 {
    public static void main(String[] args) {
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество столбцов и строк");
        int n = scan.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Положительные элементы главной диагонали: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}