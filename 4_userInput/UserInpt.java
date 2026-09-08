import java.util.Scanner;

class UserInpt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("enter you name:");
    String name = input.nextLine();

    System.out.println("enter you age:");
    int age = input.nextInt();

    System.out.println("hi" + name + " you are " + age + " year old");

  }

}
