import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
/*
      Даны действительные числа a1,a2,...,an. Найти max(a1+a2n,a2+a2n−1,...,an+an+1)
*/
        System.out.println("Введите размер массива:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        double[] num = new double[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextDouble();
        }
        System.out.println("----------------------");
        double s = num[0] + num[num.length - 1];
        for (int i = 1; i < num.length / 2; i++) {
            if ((num[i] + num[num.length - i - 1]) > s) {
                s = num[i] + num[num.length - i - 1];
            }
        }
        System.out.println("Максимальная сумма элементов = " + s);
    }
}