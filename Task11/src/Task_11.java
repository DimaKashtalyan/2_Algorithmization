import java.util.Scanner;


    public class Task_11 {
        public static void main(String[] args) {
            /*
            Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
            */
            int[][] matrix;
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите количество строк:");
            int m = scan.nextInt();
            System.out.println("Введите количество столбцов:");
            int n = scan.nextInt();
            matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                System.out.println("Строка " + (i + 1));
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }
            System.out.println();
            System.out.println("---------------------");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j += 2) {
                    if (matrix[0][j] > matrix[m - 1][j]) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }