import java.util.Arrays;
import java.util.Scanner;

class Array {
  public static void main(String[] args) {
    // int[] myarr = new int[5];
    // for (int i = 0; i < myarr.length; i++) {
    // myarr[i] = i + 1;

    // }
    // System.out.println(myarr[3]);

    // int[] numbers = { 1, 2, 3, 4, 5 };
    // System.out.println(java.util.Arrays.toString(numbers));
    int[] arr = { 1, 2, 34, 5, 6, 6, 77, 4, 3, 23, 31, 3, 4, 5, 6, 7, 8, 9 };
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    boolean isFound = Found(arr, num);
    if (isFound) {
      System.out.println("no founded");

    } else {
      System.out.println("not founded");
    }
  }

  public static boolean Found(int arr[], int num) {

    int idx = 0;

    while (idx < arr.length) {
      if (arr[idx] == num) {
        return true;
      }
      idx++;
    }
    return false;

  }
}