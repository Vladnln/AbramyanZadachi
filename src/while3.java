// задача 16
public class while3 {
    public static void main(String[] args) {
        double initialDistance = 10.0;     // Начальная дистанция в первый день
        double percentIncrease = 15.0;     // Процент увеличения дистанции каждый день
        double totalDistance = 0.0;        // Общая пройденная дистанция
        int days = 0;                      // Счётчик дней

        // Продолжаем цикл, пока общая дистанция не превысит 200 км
        while (totalDistance <= 200.0) {
            totalDistance += initialDistance; // Добавляем текущий пробег к общей сумме
            initialDistance *= (1 + percentIncrease / 100); // Увеличиваем пробег на следующий день
            days++; // Увеличиваем счётчик дней
        }

        System.out.println("Количество дней: " + days);
        System.out.printf("Общая длина пробега: %.2f км\n", totalDistance);
    }

}
