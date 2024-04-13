package Loop;

import java.util.Scanner;

/*
      *
    * *
  * * *
* * * *
 */
public class LeftTrianglePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = n; i > 0; i--) {
      for (int space = 0; space < (2 * i - 2); space++) {
        System.out.print(" ");
      }
      for (int star = 0; star < (n - i + 1); star++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
