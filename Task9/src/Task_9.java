import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9 {
    public static void main(String[] args) {
        /*
         *   9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
         *   число. Если таких чисел несколько, то определить наименьшее из них.
         */
        System.out.println("Введите размер массива: ");
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(rd.readLine());
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                int rand = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 100) * rand;
                System.out.printf("%d ", array[i]);
            }
            System.out.println("\nСортировка: ");
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + 1]) {
                        int a = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = a;
                    }
                }
                System.out.printf("%d ", array[i]);
            }
            int i, j, commonNumber, howManyTimes, counter;
            commonNumber = array[1];
            howManyTimes = 1;
            counter = 0;
            int count = 0;
            for (i = 1; i < n; i++) {
                for (j = 1; j < n; j++) {
                    if (array[i] == array[j])
                        counter++;
                    count++;
                }
                if (((howManyTimes == counter) && (commonNumber > array[i])) || (howManyTimes < counter)) {  /*выбираем меньшее из "одинаковых*/
                    commonNumber = array[i];
                    howManyTimes = counter;
                }
                counter = 0; // сбрасываем счётчик
                count = 0;
            }
            System.out.print("\n Наименьшее число = " + commonNumber +
                    " Встречается раз = " + howManyTimes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

