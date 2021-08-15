public class Equal_arrays {
    public static void main(String[] argument){
        int[] array1 = {23, 56, 26, 14, 76, 48, -24, -346};
        int[] array2 = {23, 56, 26, 14, 76, 48, -24, -346};
        System.out.println(is_equal(array1, array2));
    }
    static boolean is_equal(int[] arr1, int[] arr2){

        for(int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
