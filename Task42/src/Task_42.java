import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    массива с номерами от k до m.
*/
class Task_42 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество элементов массива большее,чем 6: ");
            int m = Integer.parseInt(read.readLine());
            int[] array = new int[m];
            if (m >= 6) {
                for (int i = 0; i < array.length; i++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    array[i] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.print(array[i] + ", ");
                }
                System.out.println("\nРезультат после вычислений: ");
                calculate(array, 1);
                calculate(array, 3);
                calculate(array, 4);
            } else {
                System.out.println("Вы ввели меньше 6 элементов: ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void calculate(int[] array, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}