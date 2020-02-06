import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String N = scanner.nextLine();
    String[] array = N.split("");
    System.out.print(array[2]+array[1]+array[0]);
  }
}