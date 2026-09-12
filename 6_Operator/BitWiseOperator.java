import java.util.Scanner;


class BitWiseOperator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter first no:");
    int a = input.nextInt();
    
    System.out.println("enter second no:");
    int b = input.nextInt();
    if((a &1)==1){
      System.out.println("odd");
    }else{
      System.out.println("even");
    }
    // System.out.println(a & b);
    // System.out.println(a | b);
    // System.out.println(a ^ b);
    // System.out.println(a << b);
    // System.out.println(a >> b);

  }
  
}
