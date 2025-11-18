public class CountDigits {

    static int count(int n) {
        if (n == 0) return 0;  
        return 1 + count(n / 10);   
    }

    public static void main(String[] args) {
        int n = 5029;
        System.out.println("Digits = " + count(n));
    }
}
