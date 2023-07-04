import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
        8. Дана последовательность целых чисел a 1 , a 2 , ... , a n . Образовать новую последовательность, выбросив из
        исходной те члены, которые равны min( a 1 , a 2 , ... , a n ) .
*/
public class Task_8 {
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            int[] firstArray;
            int min, n, count;
            int[] secondArray;
            System.out.println("Введите размер массива :");
            n = Integer.parseInt(rd.readLine());
            firstArray = new int[n];
            for (int i = 0; i < firstArray.length; i++) {
                int sing = Math.random() < 0.5 ? -1 : 1;
                firstArray[i] = (int) (Math.random() * 100) * sing;
                System.out.print(firstArray[i] + ",");
            }
            min = Integer.MAX_VALUE;
            count = 0;
            for (int element : firstArray) {
                if (element < min) {
                    min = element;
                    count = 1;
                } else if (element == min) {
                    count++;
                }
            }
            secondArray = new int[firstArray.length - count];
            for (int i = 0, j = 0; i < firstArray.length; i++, j++) {
                if (firstArray[i] != min) {
                    secondArray[j] = firstArray[i];
                } else {
                    j--;
                }
            }
            System.out.printf("%n%n Минимальное значение массива: %d%n", min);
            //Output new array
            System.out.println("\n Новый массив:");
            for (int element : secondArray)
                System.out.printf("%3d ", element);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
