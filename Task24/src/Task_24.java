import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
        Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
        причем в каждом столбце число единиц равно номеру столбца.
*/

class Task_24 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество строк");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Введите количество столбцов равное количеству строк ");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            if(m == n) {
                int count;
                for (int i = 0; i < matrix.length; i++) {
                    count = i + 1;
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (count - 1 > 0) {
                            matrix[i][j] = 0;
                            count--;
                        } else {
                            matrix[i][j] = 1;
                        }
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                    System.out.println();
                }
            }else System.out.println("Введено неправильно ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}