// задача 24
public class for4 {
    public static void main(String[] args) {
        double X = Math.PI / 3; // Пример значения X
        int N = 10;             // Количество членов ряда

        double result = 0.0;
        double term = 1.0;      // Начальный член ряда
        double factorial = 1.0; // Факториал для знаменателя
        double powerX = 1.0;    // Текущая степень X

        for (int i = 0; i <= N; i++) {
            result += term;
            powerX *= X * X;       // Следующая степень X^2
            factorial *= (2 * i + 1) * (2 * i + 2); // Следующий факториал (2i+1)*(2i+2)
            term = -term * powerX / factorial;     // Следующий член ряда
        }

        System.out.println("Приближенное значение cos(" + X + ") при N=" + N + " составляет: " + result);
    }
}
