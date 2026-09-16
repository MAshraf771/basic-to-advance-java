
public class CarObject {
  int noOFweel;
  String color;
  float mixSpeed;
  float currentFule;

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
