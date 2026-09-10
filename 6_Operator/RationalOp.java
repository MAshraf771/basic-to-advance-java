class RationalOp {
  public static void main(String[] args) {
int a = 10;
int b = 20;
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a==b);
System.out.println(a!=b);
// ? logical operator
if (a>b&&a>18) {
  System.out.println(a + " is greater than " + b + " and also greater than 18");
  
}else if(b>a||b>18){
  System.out.println(b + " is greater than " + a + " or greater than 18");
}else{
System.out.println("Both conditions are false");
}
if(!(a>b)){
  System.out.println(a + " is not greater than " + b);
}
}
}
