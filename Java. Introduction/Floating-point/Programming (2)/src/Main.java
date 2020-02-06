import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sample = scanner.nextLine();
    if(sample.contains(".")) {
      String str = sample.split("[.]")[1];
      System.out.print(str.split("")[0]); //first element
    }else{
      System.out.print("0");
    }
  }
}