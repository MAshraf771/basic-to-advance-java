import java.util.Scanner;

class MinMax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num[] = { 34, 52, 2, 14, 33, 64, };
    int minItem = minItem(num);
    System.out.println("min item is : " + minItem);
    int maxItem = maxItem(num);
    System.out.println("max item is : " + maxItem);
  }

  public static int minItem(int[] num) {

    int minItem = num[0];
    int i = 0;
    while (i < num.length) {
      if (num[i] < minItem) {
        minItem = num[i];
      }
      i++;

    }
    return minItem;
  }

  public static int maxItem(int[] num) {

    int maxItem = num[0];
    int i = 0;
    while (i < num.length) {
      if (num[i] > maxItem) {
        maxItem = num[i];
      }
      i++;

    }
    return maxItem;
  }

}
