class ProductUtility {
  int stock = 30;
  int payment = 0;
  String name;
  int price;

  ProductUtility(int price, String name) {

    this.price = price;
    this.name = name;

  }

  void buy(int qty) {
    if (qty <= stock) {
      stock -= qty;
      System.out.println("you buy " + qty + " and " + stock + " left");
      payment += price * qty;
      System.out.println("your bill is " + payment + "pk");

    } else {
      System.out.println("we only have " + stock + " picess");

    }

  }

  void refill(int qty) {
    stock += qty;
    System.out.println("you have total " + stock + " stocks");
  }
}
