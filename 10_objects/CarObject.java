
public class CarObject {
  static int carSold;
  int noOFweel;
  String color;
  int prize;
  String name;
  float mixSpeed;
  float currentFule;
  String brand;
  static {
    carSold = 0;
    System.out.println("i am in static block");
  }
  {
    carSold++;
    System.out.println("i am in inital block");
  }

  CarObject(String color, int prize, String name) {
    this.color = color;
    this.prize = prize;
    this.name = name;
    brand = "Ashraf";

  }

  CarObject() {
    this("red", 4500, "secside");
    brand = "khan";

  }

  public CarObject start() {
    if (currentFule == 0) {
      System.out.println("car has no fule ");
    } else if (currentFule < 5) {
      System.out.println("car fule is low cannot start");
    } else {
      System.out.println("car is start..");
    }
    return this;

  }

  public void drive() {
    currentFule--;
    System.out.println("car is driving.. bruhhhh");
  }

  public void AdddFule(float currentFule) {
    this.currentFule += currentFule;
  }

  public float getFule() {
    return currentFule;
  }
}
