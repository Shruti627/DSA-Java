public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;

                if (i != 1 && i != n / i) {
                    sum += n / i;
                }
            }
        }

        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a Perfect number");
        }
    }
}