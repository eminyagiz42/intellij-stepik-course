import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a1 = scanner.nextInt();
    int b1 = scanner.nextInt();
    int a2 = scanner.nextInt();
    int b2 = scanner.nextInt();
    double scalar = a1*a2 + b1*b2;
    double mod1 = Math.sqrt(a1*a1 + b1*b1);
    double mod2 = Math.sqrt(a2*a2 + b2*b2);
    double cos = Math.acos(scalar/(mod1*mod2));
    System.out.println((int)Math.toDegrees(cos));

  }
}