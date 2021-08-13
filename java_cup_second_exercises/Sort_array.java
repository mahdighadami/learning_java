import java.util.Arrays;
public class Sort_array {

    public static void main(String[] argument){
        long[] array = {3, 1, -4, 63, -16, 28};
        System.out.println(Arrays.toString(sortfunc(array)));
    }
    // Using Selection Sort:
    public static long[] sortfunc(long[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            long temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
