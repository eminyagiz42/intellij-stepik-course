// Posted from EduTools plugin
import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String N = scanner.nextLine();
    String[] array = N.split("");
    if(array.length>1) {
      System.out.print(array[array.length - 2]);
    }else {
      System.out.print(0);
    }
  }
}