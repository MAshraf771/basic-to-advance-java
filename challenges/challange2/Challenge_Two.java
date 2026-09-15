import java.util.Arrays;
import java.util.Scanner;

class Challenge_Two {
  public static void main(String[] args) {
    System.out.println("welcome to array sum and Avarage");
    int[] numarr = ArrayUtility.numArray();
    long sum = sum(numarr);
    long avg = avarage(numarr);

    System.out.println("sum of arr number is " + sum);
    System.out.println("avarage of arr number  is " + avg);

  }

  public static long sum(int[] numArr) {
    int sum = 0;
    int i = 0;
    while (i < numArr.length) {
      sum += numArr[i];
      i++;

    }
    return sum;
  }

  public static int avarage(int[] numArr) {
    long sum = sum(numArr);
    return (int) sum / numArr.length;

  }

}
