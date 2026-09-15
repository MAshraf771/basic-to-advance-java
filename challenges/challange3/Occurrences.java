import java.util.Scanner;

class Occurrences {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num[] = { 1, 2, 2, 1, 1, 1, 1, 3, 4, 5, 6, 2, 5, 5, 6, 7 };
    System.out.println("enter your number: ");
    int usNo = input.nextInt();

    int count = 0;
    int i = 0;
    while (i < num.length) {
      if (usNo == num[i]) {
        count++;
      }
      i++;

    }

    System.out.println(count);
  }

}
