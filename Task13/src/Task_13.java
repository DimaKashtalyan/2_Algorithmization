import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_13 {

    //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество строк");
            int strings = Integer.parseInt(reader.readLine());
            System.out.println("Введите количество столбцов");
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
            System.out.println("Выберите номер строки");
            int k = Integer.parseInt(reader.readLine());
            System.out.println("Выберите номер столбца");
            int p = Integer.parseInt(reader.readLine());

            System.out.println("Строка: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == k-1)
                        System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

            System.out.println("Столбец: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j == p-1)
                        System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}