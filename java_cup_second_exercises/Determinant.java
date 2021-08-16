public class Determinant {
    public static void main(String[] argument){
        int[][] matrix_a = {{1, 0}, {0, 1}} ;
        System.out.println(determinant2x2(matrix_a));
    }

    static int determinant2x2(int[][] matrix){
        return (matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]);
    }
}
