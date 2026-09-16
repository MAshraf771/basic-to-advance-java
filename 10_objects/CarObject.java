
public class CarObject {
  int noOFweel;
  String color;
  float mixSpeed;
  float currentFule;

  public void drive() {
    System.out.println("car is driving");
    currentFule--;
  }

  public void AdddFule(float fule) {
    currentFule += fule;
  }

  public float getFule() {
    return currentFule;
  }
}
