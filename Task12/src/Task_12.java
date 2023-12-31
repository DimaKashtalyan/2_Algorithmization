import java.io.*;

public class Task_12 {

    // 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество строк");
            int strings = Integer.parseInt(reader.readLine());
            System.out.println("Введите количество колонок");
            int columns = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[strings][columns];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Элементы главной диагонали:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%3d  ", matrix[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Элементы побочной диагонали:");
            for (int i = matrix.length-1; i >= 0; i--) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i + j == matrix.length-1) {
                        System.out.printf("%3d  ", matrix[i][j]);
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}