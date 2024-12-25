// задача 21
public class while4 {
    public static boolean hasOddDigit(int N) {
        if (N == 0) return false; // Ноль не содержит цифр вообще

        while (N != 0) {
            int lastDigit = N % 10; // Извлекаем последнюю цифру

            if (lastDigit % 2 != 0) { // Проверяем, является ли цифра нечётной
                return true;
            }

            N /= 10; // Переходим к следующей цифре
        }

        return false; // Если дошли сюда, значит ни одной нечётной цифры не было
    }

    public static void main(String[] args) {
        int N = 12345678; // Пример числа

        if (hasOddDigit(N)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
