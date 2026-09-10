import java.util.Scanner;

class javaChallenges {

public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  // ? area of triangle
  // System.out.println("welcome to area calculator\n");
  // System.out.println("please enter your base in cms:");
  // double base = scanner.nextDouble();
  // System.out.println("please enter your height in cms:");
  // double height = scanner.nextDouble();
  // double area = (base * height)/2;
  // System.out.println("the area of the triangle is: " + area + " cms");
  // ? calculate simple intrest
  // System.out.println("welcome to simple intrest calculator\n");
  
  // System.out.println("please enter your time in years:");
  // double T = scanner.nextDouble();

  // System.out.println("please enter your principal amount:");
  // double P = scanner.nextDouble();

  // System.out.println("please enter your rate of interest:");
  // double R = scanner.nextDouble();

  // double SI = (P * R * T) / 100;
  // System.out.println("The simple interest is: " + SI);
// ? compund intrest
//   System.out.println("welcome to compound intrest calculator\n");


//   System.out.println("please enter your principal amount:");
//   double P = scanner.nextDouble();

//   System.out.println("please enter your rate of interest:");
//   double R = scanner.nextDouble();

//   System.out.println("please enter number of times interest is compounded per year:");
//   double years = scanner.nextDouble();
// double comint = P * Math.pow (1 + R/100, years) ;
//   System.out.println("The compound interest is: " + comint);
// ? farenheit to celsius
  System.out.println("welcome to farenheit to celsius converter\n");
  
  System.out.println("please enter the temperature in farenheit:");
  double f = scanner.nextDouble();
  double c = (f - 32) * 5/9;
  System.out.println("The temperature in celsius is: " + c);

}
  
}