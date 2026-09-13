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
    // System.out.println("welcome to compound intrest calculator\n");

    // System.out.println("please enter your principal amount:");
    // double P = scanner.nextDouble();

    // System.out.println("please enter your rate of interest:");
    // double R = scanner.nextDouble();

    // System.out.println("please enter number of times interest is compounded per
    // year:");
    // double years = scanner.nextDouble();
    // double comint = P * Math.pow (1 + R/100, years) ;
    // System.out.println("The compound interest is: " + comint);
    // ? farenheit to celsius
    // System.out.println("welcome to farenheit to celsius converter\n");

    // System.out.println("please enter the temperature in farenheit:");
    // double f = scanner.nextDouble();
    // double c = (f - 32) * 5/9;
    // System.out.println("The temperature in celsius is: " + c);
    // ? chack no
    // System.out.println("enter no: ");
    // int a = scanner.nextInt();
    // if(a>0){
    // System.out.println(a + " is a positive number");

    // }else if(a<0){
    // System.out.println(a + " is a negative number");

    // }else{
    // System.out.println(a + " is zero");
    // }
    // ? odd and even
    // int a = 29;
    // if(a%2==0){
    // System.out.println(a + " is an even number");
    // } else{
    // System.out.println(a + " is an odd number");

    // }
    // ? greatest no
    // int b = 90;
    // int c = 98;
    // int d = 80;
    // if (b > c && b > d) {
    // System.out.println(b + " b is gratest");
    // } else if (c > b && c > d) {
    // System.out.println(c + " c is gratest");
    // } else {
    // System.out.println(d + " d is gratest");
    // }

    // ? lcm
    /// System.out.println(lcm(5, 6));
    // ? GCD
    // System.out.println(GCD(6, 4));
    // ? prime
    // System.out.println(Prime(5));
    // ? reverse
    // System.out.println(revser(456));
    //? fibonacci
    fibonacci(15);

  }

  // public static int lcm(int first, int second) {
  // int i = 1;
  // while (true) {

  // int factor = first * i;
  // if (factor % second == 0) {
  // return factor;
  // }
  // i++;

  // }
  // }
  // ? GCD
  // public static int GCD(int first, int second) {
  // int gcd = 1;
  // int i = 2;
  // int lest = leadst(first, second);
  // while (i <= lest) {
  // if (first % i == 0 && second % i == 0) {
  // gcd = i;
  // }
  // i++;

  // }

  // return gcd;
  // }

  // public static int leadst(int first, int second) {
  // if (first < second) {
  // return first;

  // } else {
  // return second;
  // }

  // }

  // ? Prime

  // public static Boolean Prime(int num) {
  // Boolean isPrime = true;
  // int i = 2;
  // while (i < num) {
  // if (i % num == 0) {
  // isPrime = false;
  // } else {
  // isPrime = true;
  // }

  // i++;

  // }

  // return isPrime;

  // }

  // ? reverse

  // public static int revser(int num) {
  //   int rev = 0;
  //   while (num > 0) {
  //     int digit = num % 10;
  //     rev = rev * 10 + digit;
  //     num = num / 10;

  //   }
  //   return rev;

  // }
  // ? fibonacci

  public static void fibonacci(int num) {
    if(num<0) return;
    if( num==0) return;
    int first = 0; 
    int second = 1;
   while (first + second <=num) {
    int next = first + second;
    System.out.println(next);
    first = second;
    second = next;

    
   }
   
    
  }

}