// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    short h = scan.nextShort(); //10
    short a = scan.nextShort(); //3
    short b = scan.nextShort(); //2

    System.out.print((1+(h-a)/(a-b)) + ((a-b)-1+(h-a)%(a-b))/(a-b)); //8
  }
}

/*

7
4

11
8

15
12

19
16

23
20
 */