package Loop;

import java.util.Scanner;

/*
 !n = 4
 * 
 * *
 * * *
 * * * *
 */

public class RightAngleTrianglePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }

}
