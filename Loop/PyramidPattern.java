package Loop;

import java.util.Scanner;

// i = 1; i <= n; i++

/*
  n = 4
  i = 1 space = 7
  i = 2 space = 5
  i = 3 space = 3

  n=4
  i = 1 star = 1
  i = 2 star = 3
  i = 3 star = 5

      *
    * * *
  * * * * *
* * * * * * * 


*/

public class PyramidPattern {
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
    scanner.close();
  }

}
