import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
        Сортировка обменами. Дана последовательность чисел a1<=a2<=   <=aN .Требуется переставить числа в
        порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается
        перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
        Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

public class Task_30 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество элементов последовательности: ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100) - 50;
                System.out.print(array[i] + ", ");
            }
            System.out.println("\n\n Сортировка пузырьком : ");
            int swap;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < i; j++) {

                    if (array[i] < array[j]) {
                        swap = array[i];
                        array[i] = array[j];
                        array[j] = swap;
                    }
                }
            }
            for (int value : array) {
                System.out.print(value + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}