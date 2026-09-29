
public class myBank {
  private int balance = 10;
  private String name;
  private int accNo;

  public void getBalance() {
    System.out.println(balance);

  }

  public int setBalance(int balance) {
    return this.balance += balance;
  }

}
