
public class RecurationJava {
  public static void main(String[] args) {
    // System.out.println(recurse(10));
    System.out.println(fact(10));
  }

  // public static long recurse(int a) {
  // long result = 1;
  // for (int i = 1; i <= a; i++) {
  // result *= i;

  // }
  // return result;

  // }

  public static long fact(int num) {
    if (num == 1) {
      return 1;
    }
    return num * fact(num - 1);

  }
}
