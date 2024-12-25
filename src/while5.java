// задача 30
public class while5 {
    public static void main(String[] args) {
        int A = 12; // ширина прямоугольника
        int B = 9;  // высота прямоугольника
        int C = 3;  // сторона квадрата

        int countX = 0; // количество квадратов по ширине
        int countY = 0; // количество квадратов по высоте

        // считаем количество квадратов по ширине
        for (int i = A; i >= C; i -= C) {
            countX++;
        }

        // считаем количество квадратов по высоте
        for (int j = B; j >= C; j -= C) {
            countY++;
        }

        // используем суммирование вместо умножения
        int result = 0;
        for (int k = 0; k < countY; k++) {
            result += countX;
        }

        System.out.println("Максимальное количество квадратов: " + result);
    }
}
