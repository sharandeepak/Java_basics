class Hello {
  public static void main(String[] args) {
    // ! Greatest of three numbers
    // int a = 30;
    // int b = 20;
    // int c = 10;

    // int a = 20;
    // int b = 30;
    // int c = 10;

    int a = 20;
    int b = 10;
    int c = 30;

    if (a > b) {
      if (a > c) {
        System.out.println(" A is the largest number ");
      } else {
        System.out.println(" C is the largest number ");
      }
    } else if (b > c) {
      System.out.println(" B is the lasrgest number ");
    }

    if (a > b && a > c) {
      System.out.println(" A is the largest number");
    } else if (b > a && b > c) {
      System.out.println(" B is the largest number");
    } else if (c > a && c > b) {
      System.out.println(" C is the largest number");
    }
  }
}

/*
 * - Int : Numbers
 * - Float : Decimal
 * - String : Text, long characters
 * - Char : Any symbol which is available in your keyboard is a character
 * - Long : Big Integer
 * - Short : Storing small numbers
 * - Double : Big Decimal Numbers
 * - Boolean : True or False
 * - Set : A data store where it stores unique values
 * - Array : A Group of values
 * - Map : Defined as a datastore which stores both the keys and values
 * - HashMap :
 * - class
 * 
 * Primitive vs Reference data type
 * IMPORTANT*
 * ! How come system store the variables
 * 
 */