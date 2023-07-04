import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
     Дано натуральное число N. Написать метод(методы) для формирования массива,
     элементами которого являются цифры числа N
*/
class Task_44 {
    private static void creationOfArray (int m, int n) {
        int [] array = new int [m];
        for(int i = 0; i < array.length;i++){
            array[i] = n;
            System.out.printf("%d, ", array[i]);
        }
    }
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите размер массива: ");
            int m = Integer.parseInt(read.readLine());
            System.out.println("Введите число N: ");
            int n = Integer.parseInt(read.readLine());

            creationOfArray (m, n);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}