import java.util.Scanner;
public class Factorial {
    public static void main(String[] argmnt){

        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fact_loop(n));
        System.out.println(fact_recursive(n));
    }

    static int fact_loop(int n){

        if (n == 0)
            return 1;

        int result = 1;
        while (n != 1){
            result *= n;
            n -= 1;
        }

        return result;
    }

    static int fact_recursive(int n){

        if (n == 0){
            return 1;
        }else if (n == 1){
            return 1;
        }else {
            return n * fact_recursive(n - 1);
        }
    }
}