
public class Developer {
  public static void main(String[] args) {
    Personclass developer = new Personclass("John Doe", 30, "001");
    Personclass developer2 = new Personclass("John Doe", 30, "001");
    if (developer.equals(developer2)) {
      System.out.println("Both are same");
    } else {
      System.out.println("Both are not same");
    }

  }

}
