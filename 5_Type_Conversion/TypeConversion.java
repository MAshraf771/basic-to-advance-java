/**
 * TypeConversion
 */
public class TypeConversion {
  public static void main(String args[]) {
    // type conversion and casting
    // ? 1 Automatic type conversyion/ widening - implicit
    int num = 5;
    double myF = num;
    System.out.println(myF);
    byte id = 20;
    int myId = id;

    // ? 2 Narrowing - explicit
    double marks = 10.45;
    int myMark = (int) marks;
    System.out.println(myMark);

    String age = "20";
    int myage = Integer.parseInt(age);
    System.out.println(myage);
  }

}