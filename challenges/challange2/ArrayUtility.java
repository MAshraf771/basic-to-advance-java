import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtility {
  public static int[] numArray() {
    Scanner input = new Scanner(System.in);

    System.out.println("please enter the number of arrray");
    int size = input.nextInt();
    int num[] = new int[size];
    int i = 0;
    while (i < size) {
      System.out.println("enter elem no :" + (i + 1));
      num[i] = input.nextInt();
      i++;

    }
    return num;
  }
}
