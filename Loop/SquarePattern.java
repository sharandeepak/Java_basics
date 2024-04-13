package Loop;

import java.util.Scanner;

/*
 * * * *
 * * * *
 * * * *
 */
//! Given n print n x n square

public class SquarePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        System.out.print("*");
        System.out.print(" ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
