/*
   Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
   цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
   Для решения задачи использовать декомпозицию
 */
class Task_51 {
    private static int countSubtraction(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum + ", ");
        return sum;
    }

    public static void main(String[] args) {
        int n = countSubtraction(537);
        System.out.println("\nКоличество действий: " + n);
    }
}