
class CreateProduct {
  int stock = 30;
  int payment = 0;

  public static void main(String[] args) {
    ProductUtility mobile = new ProductUtility(25000, "Dell");
    mobile.buy(3);
    mobile.refill(30);

  }

}