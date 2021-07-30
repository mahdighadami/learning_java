public class Factorial {
    public static void main(String[] argmnt){
        System.out.println(fact_loop(5));
        System.out.println(fact_recursive(3));
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
