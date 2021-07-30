public class Is_power2 {

    public static void main(String[] argmnt){
        System.out.println(is_power2(6));
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
