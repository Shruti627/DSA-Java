public class Sum {
    public int sumRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumRecursion(n - 1);
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sumRecursion(5));  
    }
}
