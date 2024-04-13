package Loop;

import java.util.Scanner;

public class DiamondPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int row = 1; row <= n; row++) {
      for (int space = 1; space <= ((n - row) * 2) + 1; space++) {
        System.out.print(" ");
      }
      for (int star = 1; star <= ((row * 2) - 1); star++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int row = n - 1; row >= 1; row--) {
      for (int space = 1; space <= 2 * (n - row) + 1; space++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= (2 * row - 1); col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
