import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        //    Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
        //     положительных и нулевых элементов.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.print(Arrays.toString(array) + "\n");
        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                ++countNegative;
            } else if (array[i] > 0) {
                ++countPositive;
            } else {
                ++countZero;
            }
        }
        System.out.println("Количество отрицательных элементов " + countNegative);
        System.out.println("Количество положительных элементов " + countPositive);
        System.out.println("Количество нулевых элементов " + countZero);
    }
}
