/*
        Матрицу 10x20 заполнить случайными числами от 0 до 15.
        Вывести на экран саму матрицу и номера строк, в
        которых число 5 встречается три и более раз
 */
public class Task_21 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int count;
        System.out.println("\nНомер строки, где число 5 встречается три и более раз: ");
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.printf("%d, ", i + 1);
            }
        }
        System.out.println("\b\b");
    }
}