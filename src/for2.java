// задача 8
public class for2 {
    public static void main(String[] args) {
        int A = 3;
        int B = 6;

        long product = 1;

        for (int i = A; i <= B; i++) {
            product *= i;
        }

        System.out.println("Произведение всех чисел от " + A + " до " + B + " равно: " + product);
    }
}
