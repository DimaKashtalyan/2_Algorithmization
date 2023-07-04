import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите натуральное число k ");
        int k = scanner.nextInt();

        int sum = 0;
        for (int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print(Arrays.toString(array)+ "\n");

        for (int value : array) {
            if (value % k == 0) {
                sum = sum + value;
            }
        }
        System.out.print("Сумма элементов, которые кратны "+ k + " это " + sum);
    }
}
