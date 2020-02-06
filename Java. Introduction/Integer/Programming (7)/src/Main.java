import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hour1 = scanner.nextInt(); //1:1:01
    int minute1 = scanner.nextInt(); //1:2:30
    int seconds1 = scanner.nextInt();

    int hour2 = scanner.nextInt(); //2:2:02
    int minute2 = scanner.nextInt(); // 1:3:20
    int seconds2 = scanner.nextInt();

    int timeDifference = ((hour2 - hour1) * 3600) +((minute2 - minute1) * 60)+((seconds2 - seconds1));


    System.out.print(timeDifference);

  }
}