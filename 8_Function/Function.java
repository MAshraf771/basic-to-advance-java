public class Function {
  public static void main(String[] args) {
    // greetUser();
    // System.out.println(Addition(10, 40));
    // multiplication(7);
    // OddNum(10);
    // System.out.println(Fact(5));
    // System.out.println(sumOfDigit(456));

  }

  public static void greetUser() {
    System.out.println("good morning form java");
  }

  public static int Addition(int a, int b) {
    return a + b;
  }

  public static void multiplication(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + "x" + i + "=" + num * i);

    }

  }

  public static void OddNum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
        sum = sum + i;
      }

    }
    System.out.println(sum);

  }

  public static int Fact(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * Fact(n - 1);
    }
  }

  public static int sumOfDigit(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num = num / 10;

    }
    return sum;
  }

  public static int LCM(int num1, int num2) {

    return num1;
  }

}