import java.util.Scanner;

class UserInpt {
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);

    // System.out.println("enter you name:");
    // String name = input.nextLine();

    // System.out.println("enter you age:");
    // int age = input.nextInt();

    // System.out.println("hi" + name + " you are " + age + " year old");

Scanner input = new Scanner(System.in);
  
System.out.println("Enter your name: ");
String name  = input.nextLine();
System.out.println(name +" welcome to  java world");

System.out.println("Enter a: ");
int a  = input.nextInt();
System.out.println("Enter b: ");
int b  = input.nextInt();
System.out.println("total is ="+a+b);


  }

}
