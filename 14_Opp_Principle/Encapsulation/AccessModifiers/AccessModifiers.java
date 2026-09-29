
public class AccessModifiers {
  public static void main(String[] args) {
    publicClass car = new publicClass();
    car.color = "red";
    car.model = "jecoo";
    // car.costofprached = 1
    publicClass jecco = new publicClass("red", "jecco", 100, 93000);
    System.out.println(jecco);

  }

}
