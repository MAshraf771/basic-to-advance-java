
public class Driver {
  static int minimumAgeforDriving = 18;
  int name;
  String dateOfLicence;
  int age;

  public boolean isAllowedDrive() {
    return this.age > minimumAgeforDriving;
  }

  public static void main(String[] args) {
    // CarObject mycar = new CarObject();
    // mycar.start();
    // mycar.drive();
    // mycar.AdddFule(4);
    // System.out.println(mycar.getFule());
    CarObject Bmw = new CarObject("red", 930000, "cavic");
    CarObject seccside = new CarObject();
    Bmw.AdddFule(6);
    CarObject startedCar = Bmw.start();
    startedCar.drive();
    System.out.println(Bmw.color);
    System.out.println(Bmw.name);
    System.out.println(Bmw.prize);
    System.out.println(seccside.brand);
    System.out.println(Bmw.brand);
    //// Bmw.start().drive();
    Driver myDriver = new Driver();
    // myDriver.isAllowedDrive();

  }
}
