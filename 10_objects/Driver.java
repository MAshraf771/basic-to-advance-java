
public class Driver {
  public static void main(String[] args) {
    // CarObject mycar = new CarObject();
    // mycar.start();
    // mycar.drive();
    // mycar.AdddFule(4);
    // System.out.println(mycar.getFule());
    CarObject Bmw = new CarObject();
    Bmw.AdddFule(6);
    CarObject startedCar = Bmw.start();
    startedCar.drive();
    //// Bmw.start().drive();

  }
}
