import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int num = Math.abs(n);
        int cnt = 0;

        if (num == 0) {
            cnt = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                cnt++;
            }
        }

        System.out.println(cnt);
        
    }
}
