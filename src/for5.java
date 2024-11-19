// задача 36
public class for5 {
    public static void main(String[] args) {
        int N = 5;
        int K = 3;

        double sum = 0.0;

        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, K);
        }

        System.out.println("Сумма 1^" + K + " + 2^" + K + " + ... + " + N + "^" + K + " равна: " + sum);
    }
}
