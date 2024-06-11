package lab1;
import java.util.Arrays;
import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                System.out.println(number);
            } else
                scanner.next();
        }
    }
}
