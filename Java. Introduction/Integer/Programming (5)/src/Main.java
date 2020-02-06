// Posted from EduTools plugin
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String N = scanner.nextLine();
    String[] array = N.split("");

    System.out.print(Integer.parseInt(array[0])+Integer.parseInt(array[1])+Integer.parseInt(array[2]));
  }
}