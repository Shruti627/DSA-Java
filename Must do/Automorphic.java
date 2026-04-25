import java.util.Scanner;

public class Automorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println("Not an Automorphic Number");
                return;
            }
            temp /= 10;
            square /= 10;
        }

        System.out.println("Automorphic Number");
    }
}