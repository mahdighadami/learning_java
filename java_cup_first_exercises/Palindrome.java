import java.util.Scanner;
public class Palindrome {

    public static void main(String[] argmnt){

        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(palindrome(n));
    }

    static boolean palindrome(int n){

        int number = n;
        int a = 0;

        while (number != 0){
            int remaining = number % 10;
            a *= 10;
            a += remaining;
            number -= remaining;
            number /= 10;
        }

        return a == n;
    }
}
