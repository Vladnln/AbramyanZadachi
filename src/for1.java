// задача 3
public class for1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;

        // Переменная для хранения количества чисел
        int count = 0;

        System.out.println("Числа между " + A + " и " + B + ":");

        for(int i = B - 1; i > A; i--) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println("\nКоличество чисел: " + count);
    }
}
