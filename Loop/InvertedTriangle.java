package Loop;

import java.util.Scanner;

/*
n=4

n + 3



star sample space
i = 5 the result = 9
i = 4 the result = 7
i = 3 the result = 5
i = 2 the result = 3
i = 1 the result = 1


space sample space
n = 4
i = 4 the result = 0
i = 3 the result = 2
i = 2 the result = 4
i = 1 the result = 6

spaceFormula = 2 * (n - i)

starFormula = 2 * (i - 1)

i = n; i >= 1; i--
* * * * * * *
  * * * * *
    * * *
      *


i = 1; i <= n; i++
      *
    * * *
  * * * * *
* * * * * * *  
*/
public class InvertedTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int row = n; row >= 1; row--) {
      for (int space = 1; space <= 2 * (n - row); space++) {
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
