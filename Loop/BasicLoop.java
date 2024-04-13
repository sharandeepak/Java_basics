package Loop;

import java.util.Scanner;

public class BasicLoop {
  // ! Loop type
  /*
   * For Loop tick
   * While Loop
   * Do While Loop
   */
  public static void main(String[] args) {
    // program to print 1 to n
    System.out.println("Enter you number : ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // for (int i = 1; i <= n; i = i + 1) {
    // System.out.println(i);
    // }

    int i = 11;
    while (i <= n) {
      System.out.print(i);
      i++;
    }

    do {
      System.out.println(i);
    } while (i <= n);
    scanner.close();
    // System.out.println();
  }

}
