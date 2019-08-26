package Exercise1;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d;
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();
        d = (b + Math.sqrt((Math.pow(b,2) + 4*a*c)))/2*a - Math.pow(a,3)*c + Math.pow(b,-2);
        System.out.print(d);
    }
}
