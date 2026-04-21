
public class Armstrong {
    public static void main(String[] args) {

        int num = 9474;
        int original = num;
        int temp = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original)
            System.out.println("Armstrong number!");
        else
            System.out.println("Not an Armstrong number!");
    }
}