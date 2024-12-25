// задача 3
public class while1 {
    public static void main(String[] args) {
        int N = 17; // замените на нужное значение N
        int K = 4;  // замените на нужное значение K

        int quotient = 0; // частное
        int remainder = N; // остаток

        while (remainder >= K) {
            remainder -= K;
            quotient++;
        }

        System.out.println("Частное: " + quotient);
        System.out.println("Остаток: " + remainder);
    }
}
