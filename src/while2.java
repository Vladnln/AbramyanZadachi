// задача 9
public class while2 {
    public static void main(String[] args) {
        int N = 100; // Заменить на нужное значение N

        int K = 0;
        long power = 1; // Начальное значение степени тройки (3^0)

        while (power <= N) {
            power *= 3; // Вычисляем следующую степень тройки
            K++; // Увеличиваем K
        }

        System.out.println("Наименьшее K, при котором 3^K > N: " + K);
    }
}
