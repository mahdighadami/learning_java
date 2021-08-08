import java.util.Scanner;
public class Is_power2 {

    public static void main(String[] argmnt){

        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(is_power2(n));
    }

    static boolean is_power2(int n){
        if (n == 0){
            return false;
        }

        while (n != 1){
            if (n % 2 == 0){
                n = n / 2;

            }else{
                return false;
            }
        }
        return true;
    }
}
