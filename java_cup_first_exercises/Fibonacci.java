public class Fibonacci {
    public static void main(String[] argmnt) {
        int m = 1;
        while (fibonacci(m) < 1000) {
            System.out.println(fibonacci(m));
            m++;
        }
    }
    static int fibonacci(int n){
        if (n < 1) {
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n == 2){
            return  1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
