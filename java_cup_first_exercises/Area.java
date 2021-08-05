import java.util.Scanner;
public class Area {
    public static void main(String[] argument) {
        System.out.println("Enter the radius:");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        System.out.println(area(n));

    }
    static double area(double radius){
        return radius * radius * 3.1415;

    }
}
