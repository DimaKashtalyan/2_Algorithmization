import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
     Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
*/
class Task_45 {
    private static String moreDigits(int m, int n) {
        int firstCount = (int)(Math.log10(Math.abs(m))+1);
        int secondCount = (int)(Math.log10(Math.abs(n))+1);
        if (firstCount == secondCount) {
            return "Одинаковое количество цифр";
        } else {
            return (firstCount > secondCount) ? ("M содержит больше") : ("N содердит больше");
        }
    }
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число M: ");
            int m = Integer.parseInt(read.readLine());
            System.out.println("Введите число N: ");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Число, которое содержит больше цифр: ");
            System.out.println(moreDigits(m, n));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
