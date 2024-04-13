public class SwitchCase {
  public static void main(String[] args) {
    // Switch Case
    // Finds Fruit or Vegetable
    String name = "Apple";
    switch (name) {
      case "Apple":
        System.out.println("Apple");
      case "Mango":
        System.out.println("Mango");
      case "Banana":
        System.out.println("Banana");
      default:
        System.out.println("Vegetable");
    }

    if (name == "Apple") {
      System.out.println("Apple");
    }
    if (name == "Mango") {
      System.out.println("Apple");
    }
    if (name == "Banana") {
      System.out.println("Apple");
    }
  }
}
